
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import CallingServiceContextTaxiRequestManager from "./components/listers/CallingServiceContextTaxiRequestCards"
import CallingServiceContextTaxiRequestDetail from "./components/listers/CallingServiceContextTaxiRequestDetail"
import CallingServiceContextTaxiAssignmentManager from "./components/listers/CallingServiceContextTaxiAssignmentCards"
import CallingServiceContextTaxiAssignmentDetail from "./components/listers/CallingServiceContextTaxiAssignmentDetail"
import CallingServiceContextTaxiTripManager from "./components/listers/CallingServiceContextTaxiTripCards"
import CallingServiceContextTaxiTripDetail from "./components/listers/CallingServiceContextTaxiTripDetail"
import CallingServiceContextTripRecordManager from "./components/listers/CallingServiceContextTripRecordCards"
import CallingServiceContextTripRecordDetail from "./components/listers/CallingServiceContextTripRecordDetail"

import DriverServiceContextDriverManager from "./components/listers/DriverServiceContextDriverCards"
import DriverServiceContextDriverDetail from "./components/listers/DriverServiceContextDriverDetail"

import CustomerServiceContextCustomerManager from "./components/listers/CustomerServiceContextCustomerCards"
import CustomerServiceContextCustomerDetail from "./components/listers/CustomerServiceContextCustomerDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/callingServiceContexts/taxiRequests',
                name: 'CallingServiceContextTaxiRequestManager',
                component: CallingServiceContextTaxiRequestManager
            },
            {
                path: '/callingServiceContexts/taxiRequests/:id',
                name: 'CallingServiceContextTaxiRequestDetail',
                component: CallingServiceContextTaxiRequestDetail
            },
            {
                path: '/callingServiceContexts/taxiAssignments',
                name: 'CallingServiceContextTaxiAssignmentManager',
                component: CallingServiceContextTaxiAssignmentManager
            },
            {
                path: '/callingServiceContexts/taxiAssignments/:id',
                name: 'CallingServiceContextTaxiAssignmentDetail',
                component: CallingServiceContextTaxiAssignmentDetail
            },
            {
                path: '/callingServiceContexts/taxiTrips',
                name: 'CallingServiceContextTaxiTripManager',
                component: CallingServiceContextTaxiTripManager
            },
            {
                path: '/callingServiceContexts/taxiTrips/:id',
                name: 'CallingServiceContextTaxiTripDetail',
                component: CallingServiceContextTaxiTripDetail
            },
            {
                path: '/callingServiceContexts/tripRecords',
                name: 'CallingServiceContextTripRecordManager',
                component: CallingServiceContextTripRecordManager
            },
            {
                path: '/callingServiceContexts/tripRecords/:id',
                name: 'CallingServiceContextTripRecordDetail',
                component: CallingServiceContextTripRecordDetail
            },

            {
                path: '/driverServiceContexts/drivers',
                name: 'DriverServiceContextDriverManager',
                component: DriverServiceContextDriverManager
            },
            {
                path: '/driverServiceContexts/drivers/:id',
                name: 'DriverServiceContextDriverDetail',
                component: DriverServiceContextDriverDetail
            },

            {
                path: '/customerServiceContexts/customers',
                name: 'CustomerServiceContextCustomerManager',
                component: CustomerServiceContextCustomerManager
            },
            {
                path: '/customerServiceContexts/customers/:id',
                name: 'CustomerServiceContextCustomerDetail',
                component: CustomerServiceContextCustomerDetail
            },



    ]
})
