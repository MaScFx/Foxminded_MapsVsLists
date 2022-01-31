package com.example.task4.fragments;

import static com.example.task4.model.constants.Operations.AddingNewHM;
import static com.example.task4.model.constants.Operations.AddingNewTM;
import static com.example.task4.model.constants.Operations.RemovingHM;
import static com.example.task4.model.constants.Operations.RemovingTM;
import static com.example.task4.model.constants.Operations.SearchHM;
import static com.example.task4.model.constants.Operations.SearchTM;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.task4.R;
import com.example.task4.customview.ResultView;
import com.example.task4.databinding.MapsFragmentBinding;
import com.example.task4.presenter.MainApp;
import com.example.task4.presenter.MapPresenter;

import java.util.HashMap;
import java.util.Objects;

import javax.inject.Inject;


public class MapsFragment extends Fragment implements IResultObserver {

    private MapsFragmentBinding binding;
    private final HashMap<Integer, ResultView> views = new HashMap<>();
    @Inject
    public MapPresenter presenter;
    private boolean check = false;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = MapsFragmentBinding.inflate(getLayoutInflater(), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((MainApp) requireContext().getApplicationContext()).appComponent.inject(this);
        viewsInit();
        presenter.attachView(this);
        presenter.viewCreated(views.keySet());

        binding.btnCalculateMap.setOnClickListener(v -> {
            String size = Objects.requireNonNull(binding.etMapSize.getText()).toString();
            if (!size.equals("") && Integer.parseInt(size) > 9) {
                presenter.calculate(Integer.parseInt(size));

                setVisibleResult(true);
                clearUIData();
            }
        });

        binding.btnClearMap.setOnClickListener(v -> {
            setVisibleResult(false);
        });
    }

    private void clearUIData() {
        for (ResultView view : views.values()) {
            view.setResult(getString(R.string.space));
        }
    }

    @Override
    public void dataSetChanged(Integer testID, String result) {
        if (!check) {
            setVisibleResult(true);
            check = false;
        }
        views.get(testID).setResult(result);
    }

    private void setVisibleResult(Boolean visible) {
        if (visible) {
            binding.constraintLayout.setVisibility(View.VISIBLE);
            binding.frameLayoutMap.setVisibility(View.GONE);
            binding.tvSizeDescMap.setVisibility(View.GONE);
        } else {
            binding.constraintLayout.setVisibility(View.GONE);
            binding.frameLayoutMap.setVisibility(View.VISIBLE);
            binding.tvSizeDescMap.setVisibility(View.VISIBLE);
        }
    }

    private void viewsInit() {
        views.put(AddingNewHM.ordinal(), binding.rvAddingHashMap);
        views.put(AddingNewTM.ordinal(), binding.rvAddingTreeMap);
        views.put(SearchHM.ordinal(), binding.rvSearchByKeyHashMap);
        views.put(SearchTM.ordinal(), binding.rvSearchByKeyTreeMap);
        views.put(RemovingHM.ordinal(), binding.rvRemovingHashMap);
        views.put(RemovingTM.ordinal(), binding.rvRemovingTreeMap);
    }
}