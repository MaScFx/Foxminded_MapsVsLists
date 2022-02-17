package com.example.task4.fragments;

import static com.example.task4.model.constants.Operations.*;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.task4.R;
import com.example.task4.customview.ResultView;
import com.example.task4.databinding.CollectionsFragmentBinding;
import com.example.task4.di.DiConst;
import com.example.task4.presenter.FragmentPresenter;

import java.util.HashMap;
import java.util.Objects;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.android.support.DaggerFragment;

public class CollectionsFragment extends DaggerFragment implements IResultObserver {

    private CollectionsFragmentBinding binding;
    private final HashMap<Integer, ResultView> views = new HashMap<>();
    @Inject
    @Named(DiConst.COLLECTION_FRAGMENT)
    public FragmentPresenter presenter;

    private boolean check = false;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = CollectionsFragmentBinding.inflate(getLayoutInflater(), container, false);

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        viewsInit();
        presenter.attachView(this);
        presenter.viewCreated(views.keySet());

        binding.btnCalculateList.setOnClickListener(v -> {
            String size = Objects.requireNonNull(binding.etCollectionSize.getText()).toString();
            if (!size.equals("") && Integer.parseInt(size) >= 9) {
                presenter.calculate(Integer.parseInt(size));
                setVisibleResult(true);

                clearUIData();
            }
        });

        binding.btnClearList.setOnClickListener(v -> {
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
            binding.cfConstraintLayout.setVisibility(View.VISIBLE);
            binding.frameLayoutList.setVisibility(View.GONE);
            binding.tvSizeDescList.setVisibility(View.GONE);
        } else {
            binding.tvSizeDescList.setVisibility(View.VISIBLE);
            binding.frameLayoutList.setVisibility(View.VISIBLE);
            binding.cfConstraintLayout.setVisibility(View.GONE);
        }
    }

    private void viewsInit() {
        views.put(AddingBeginningAL.ordinal(), binding.rvAddBeginArraylist);
        views.put(AddingBeginningLL.ordinal(), binding.rvAddBeginLinkedList);
        views.put(AddingBeginningCoW.ordinal(), binding.rvAddBeginCopyOnWrite);
        views.put(AddingMiddleAL.ordinal(), binding.rvAddMiddleArraylist);
        views.put(AddingMiddleLL.ordinal(), binding.rvAddMiddleLinkedList);
        views.put(AddingMiddleCoW.ordinal(), binding.rvAddMiddleCopyOnWrite);
        views.put(AddingEndAL.ordinal(), binding.rvAddEndArraylist);
        views.put(AddingEndLL.ordinal(), binding.rvAddEndLinkedList);
        views.put(AddingEndCoW.ordinal(), binding.rvAddEndCopyOnWrite);
        views.put(SearchAL.ordinal(), binding.rvSearchArraylist);
        views.put(SearchLL.ordinal(), binding.rvSearchLinkedList);
        views.put(SearchCoW.ordinal(), binding.rvSearchCopyOnWrite);
        views.put(RemovingBeginningAL.ordinal(), binding.rvRemovingBeginningArraylist);
        views.put(RemovingBeginningLL.ordinal(), binding.rvRemovingBeginningLinkedList);
        views.put(RemovingBeginningCoW.ordinal(), binding.rvRemovingBeginningCopyOnWrite);
        views.put(RemovingMiddleAL.ordinal(), binding.rvRemovingMiddleArraylist);
        views.put(RemovingMiddleLL.ordinal(), binding.rvRemovingMiddleLinkedList);
        views.put(RemovingMiddleCoW.ordinal(), binding.rvRemovingMiddleCopyOnWrite);
        views.put(RemovingEndAL.ordinal(), binding.rvRemovingEndArraylist);
        views.put(RemovingEndLL.ordinal(), binding.rvRemovingEndLinkedList);
        views.put(RemovingEndCoW.ordinal(), binding.rvRemovingEndCopyOnWrite);
    }
}