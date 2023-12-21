<template>
    <v-card outlined>
        <v-card-title>
            UpdateTaxiLocation
        </v-card-title>

        <v-card-text>
            <UUID offline label="DriverId" v-model="value.driverId" :editMode="editMode" @change="change"/>
            <UUID offline label="TaxiId" v-model="value.taxiId" :editMode="editMode" @change="change"/>
            <Address offline label="CurrentLocation" v-model="value.currentLocation" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="updateTaxiLocation"
            >
                UpdateTaxiLocation
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'UpdateTaxiLocationCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.driverId = {};
            this.value.taxiId = {};
            this.value.currentLocation = {};
        },
        watch: {
        },
        methods: {
            updateTaxiLocation() {
                this.$emit('updateTaxiLocation', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

