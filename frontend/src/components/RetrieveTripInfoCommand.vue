<template>
    <v-card outlined>
        <v-card-title>
            RetrieveTripInfo
        </v-card-title>

        <v-card-text>
            <UUID offline label="TripId" v-model="value.tripId" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="retrieveTripInfo"
            >
                RetrieveTripInfo
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
        name: 'RetrieveTripInfoCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.tripId = {};
        },
        watch: {
        },
        methods: {
            retrieveTripInfo() {
                this.$emit('retrieveTripInfo', this.value);
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

