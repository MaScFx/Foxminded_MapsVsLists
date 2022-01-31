package com.example.task4.di;

import com.example.task4.fragments.CollectionsFragment;
import com.example.task4.fragments.MapsFragment;
import com.example.task4.model.IDataKeeper;
import com.example.task4.model.OperationRunner;
import com.example.task4.presenter.CollectionPresenter;
import com.example.task4.presenter.FragmentPresenter;
import com.example.task4.presenter.MapPresenter;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Component;
import dagger.Module;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(CollectionsFragment collectionsFragment);

    void inject(MapsFragment mapsFragment);
}

@Module(includes = {AppBindModule.class})
class AppModule {
}

@Module
interface AppBindModule {
    @Binds
    FragmentPresenter bindsCollectionPresenter_to_FragmentPresenter(CollectionPresenter presenter);

    @Binds
    FragmentPresenter bindsMapPresenter_to_FragmentPresenter(MapPresenter presenter);

    @Binds
    IDataKeeper bindsOperationRunner_to_IDataKeeper(OperationRunner operationRunner);
}