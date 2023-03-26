package net.denis.banka.di.module

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import net.denis.banka.data.repository.ResourceRepository
import net.denis.banka.data.interfaces.IResourceRepository

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {

    @Binds
    @ViewModelScoped
    abstract fun bindIResourceRepository(resourceRepository: ResourceRepository): IResourceRepository

}