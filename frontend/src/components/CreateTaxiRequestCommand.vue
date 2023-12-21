<template>
    <v-card outlined>
        <v-card-title>
            CreateTaxiRequest
        </v-card-title>

        <v-card-text>
            <Address offline label="DepartureLocation" v-model="value.departureLocation" :editMode="editMode" @change="change"/>
            <Address offline label="Destination" v-model="value.destination" :editMode="editMode" @change="change"/>
            <int offline label="PassengerCount" v-model="value.passengerCount" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="createTaxiRequest"
            >
                CreateTaxiRequest
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
        name: 'CreateTaxiRequestCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.departureLocation = {};
            this.value.destination = {};
            this.value.passengerCount = {};
        },
        watch: {
        },
        methods: {
            createTaxiRequest() {
                this.$emit('createTaxiRequest', this.value);
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

