package com.example.task4.di;

import android.app.Application;

import com.example.task4.fragments.CollectionsFragment;
import com.example.task4.fragments.MapsFragment;
import com.example.task4.model.IDataKeeper;
import com.example.task4.model.OperationRunner;
import com.example.task4.presenter.CollectionPresenter;
import com.example.task4.presenter.FragmentPresenter;
import com.example.task4.presenter.MainApp;
import com.example.task4.presenter.MapPresenter;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.ContributesAndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {AppModule.class, AndroidSupportInjectionModule.class})
public interface AppComponent extends AndroidInjector<MainApp> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}

@Module(includes = {AppBindModule.class, ActivityBuildersModule.class})
class AppModule {
}

@Module
interface AppBindModule {
    @Binds
    @Named("collectionFragment")
    @Singleton
    FragmentPresenter bindsCollectionPresenter_to_FragmentPresenter(CollectionPresenter presenter);

    @Binds
    @Named("mapsFragment")
    @Singleton
    FragmentPresenter bindsMapPresenter_to_FragmentPresenter(MapPresenter presenter);

    @Binds
    @Singleton
    IDataKeeper bindsOperationRunner_to_IDataKeeper(OperationRunner operationRunner);
}

@Module
abstract class ActivityBuildersModule {
    @ContributesAndroidInjector
    abstract MainApp contributeMainApp();

    @ContributesAndroidInjector
    abstract CollectionsFragment contributeCollectionsFragment();

    @ContributesAndroidInjector
    abstract MapsFragment contributeMapsFragment();
}