package com.eflagcomm.android_jetpack_kotlin.model

object CatalogModel {



     fun createCatalog() : MutableList<CatalogBean> {

        var firstKnowJpk = CatalogBean(0,"初识Jetpack")
        var lifeCycle = CatalogBean(1,"lifeCycle")
        var navigation = CatalogBean(2,"navigation")
        var viewModel = CatalogBean(3,"viewModel")
        var liveData = CatalogBean(4,"liveData")
        var room = CatalogBean(5,"room")
        var workManager = CatalogBean(6,"workManager")
        var dataBinding = CatalogBean(7,"dataBinding")
        var paging = CatalogBean(8,"paging")
        var mvvm = CatalogBean(9,"mvvm架构")
        var snDemo = CatalogBean(10,"snDemo")
        var hilt = CatalogBean(11,"hilt依赖")

        var catalogList = mutableListOf<CatalogBean>(firstKnowJpk,lifeCycle,navigation,viewModel,
            liveData,room,workManager,dataBinding,paging, mvvm,snDemo,hilt)


        return catalogList
    }

}

data class CatalogBean(var id: Int, var cataName: String)