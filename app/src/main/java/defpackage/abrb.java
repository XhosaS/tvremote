package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class abrb implements abxk {
    @Override // defpackage.abxk
    public final /* bridge */ /* synthetic */ Object a(int i) {
        abqn abqnVar;
        abqn abqnVar2 = abqn.DATA_USAGE_NONE;
        if (i == 0) {
            abqnVar = abqn.DATA_USAGE_NONE;
        } else if (i == 1) {
            abqnVar = abqn.DATA_USAGE_TARGETING;
        } else if (i != 2) {
            switch (i) {
                case 4:
                    abqnVar = abqn.DATA_USAGE_LOGGING;
                    break;
                case 16:
                    abqnVar = abqn.DATA_USAGE_PRIVACY_CONTROL_NEEDS_PRIVACY_APPROVAL;
                    break;
                case 64:
                    abqnVar = abqn.DATA_USAGE_ADSPAM;
                    break;
                case 128:
                    abqnVar = abqn.DATA_USAGE_READ_FOR_KANSAS_WRITE;
                    break;
                case 512:
                    abqnVar = abqn.DATA_USAGE_MEASUREMENT_EXTERNAL;
                    break;
                case 1024:
                    abqnVar = abqn.DATA_USAGE_EXPERIMENTS;
                    break;
                case 2048:
                    abqnVar = abqn.DATA_USAGE_AGGREGATE_SERVER_METRICS;
                    break;
                case 4096:
                    abqnVar = abqn.DATA_USAGE_CHECK_COOKIE_LINKAGE_NEEDS_PRIVACY_APPROVAL;
                    break;
                case 8192:
                    abqnVar = abqn.DATA_USAGE_GENERATE_PREDICTION_QEM;
                    break;
                case 16384:
                    abqnVar = abqn.DATA_USAGE_GENERATE_PREDICTION_QEM_WITH_CARVEOUT_NEEDS_PRIVACY_APPROVAL;
                    break;
                case 32768:
                    abqnVar = abqn.DATA_USAGE_COOKIE_MATCHING;
                    break;
                case 65536:
                    abqnVar = abqn.DATA_USAGE_CLICK_URL_CUSTOMIZATION;
                    break;
                case 131072:
                    abqnVar = abqn.DATA_USAGE_ADX_TARGETING_IN_SUPERMIXER;
                    break;
                case 262144:
                    abqnVar = abqn.DATA_USAGE_TRIGGER_ELIGIBLE_COOKIE_LINK_NEEDS_PRIVACY_APPROVAL;
                    break;
                case 524288:
                    abqnVar = abqn.DATA_USAGE_SHARE_EXTERNALLY;
                    break;
                case 1048576:
                    abqnVar = abqn.DATA_USAGE_CROSS_DOMAIN_SEQUENCING_NEEDS_PRIVACY_APPROVAL;
                    break;
                case 2097152:
                    abqnVar = abqn.DATA_USAGE_LOGGING_FOR_TARGETING;
                    break;
                case 4194304:
                    abqnVar = abqn.DATA_USAGE_PUBLISHER_DATA_PREDICTION_PROCESSING_AND_SHARING;
                    break;
                case 8388608:
                    abqnVar = abqn.DATA_USAGE_UI_CUSTOMIZATION;
                    break;
                case 16777216:
                    abqnVar = abqn.DATA_USAGE_POLICY_CONTROL_NEEDS_PRIVACY_APPROVAL;
                    break;
                case 33554432:
                    abqnVar = abqn.DATA_USAGE_FILL_CLICK_URL_DATA_NEEDS_PRIVACY_APPROVAL_DEPRECATED;
                    break;
                case 67108864:
                    abqnVar = abqn.DATA_USAGE_MEASUREMENT;
                    break;
                case 134217728:
                    abqnVar = abqn.DATA_USAGE_COUNTERFACTUAL_EXPERIMENT;
                    break;
                case 268435456:
                    abqnVar = abqn.DATA_USAGE_MUTES;
                    break;
                case 536870912:
                    abqnVar = abqn.DATA_USAGE_READ_LOC_CONTEXT_FOR_GEO_LOC_DATA_PROTO_NEEDS_PRIVACY_APPROVAL;
                    break;
                case 1073741824:
                    abqnVar = abqn.DATA_USAGE_READ_FROM_CACHE_NEEDS_PRIVACY_APPROVAL;
                    break;
                default:
                    switch (i) {
                        case 32:
                            abqnVar = abqn.DATA_USAGE_AD_EXCHANGE;
                            break;
                        case 33:
                            abqnVar = abqn.DATA_USAGE_VIDEO_ADS_SEQUENCING;
                            break;
                        case 34:
                            abqnVar = abqn.DATA_USAGE_A1_INFRA_DMA52_POLICY_CONTROL_CARVE_OUT_NEEDS_PRIVACY_APPROVAL;
                            break;
                        case 35:
                            abqnVar = abqn.DATA_USAGE_STORE_VISIT_LIFT_MEASUREMENT;
                            break;
                        case 36:
                            abqnVar = abqn.DATA_USAGE_SURVEY_LIFT;
                            break;
                        case 37:
                            abqnVar = abqn.DATA_USAGE_SHARE_EXTERNALLY_IN_BID_REQUESTS;
                            break;
                        case 38:
                            abqnVar = abqn.DATA_USAGE_INFRASTRUCTURE_METRICS_NEEDS_PRIVACY_APPROVAL;
                            break;
                        case 39:
                            abqnVar = abqn.DATA_USAGE_PROVISION_OF_SERVICE_INFRASTRUCTURE_NEEDS_PRIVACY_APPROVAL;
                            break;
                        case 40:
                            abqnVar = abqn.DATA_USAGE_VERIFICATION_TESTING_VALIDATION_NEEDS_PRIVACY_APPROVAL;
                            break;
                        case 41:
                            abqnVar = abqn.DATA_USAGE_MEDIATION_GROUP_SELECTION;
                            break;
                        case 42:
                            abqnVar = abqn.DATA_USAGE_CONVERSION_ATTRIBUTION;
                            break;
                        case 43:
                            abqnVar = abqn.DATA_USAGE_A1_INFRA_AADC_INFERENCE_PRIVACY_CONTROL_CARVEOUT;
                            break;
                        case 44:
                            abqnVar = abqn.DATA_USAGE_RESTRICTED_VIRTUAL_COPY_NEEDS_PRIVACY_APPROVAL;
                            break;
                        case 45:
                            abqnVar = abqn.DATA_USAGE_NON_PERSONAL_AGGREGATE_TARGETING_MODELS;
                            break;
                        default:
                            abqnVar = null;
                            break;
                    }
            }
        } else {
            abqnVar = abqn.DATA_USAGE_NEGATIVE_AD_SELECTION_NEEDS_PRIVACY_APPROVAL;
        }
        return abqnVar == null ? abqn.UNRECOGNIZED : abqnVar;
    }
}
