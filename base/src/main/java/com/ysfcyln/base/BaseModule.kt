package com.ysfcyln.base

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class BaseModule {

    @Provides
    @Singleton
    fun provideDatabaseService() =  DatabaseService()

    @Provides
    @Singleton
    fun provideNetworkService() = NetworkService()
}