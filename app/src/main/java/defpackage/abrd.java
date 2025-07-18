package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum abrd implements abxf {
    PROCESSING_PURPOSE_UNSPECIFIED(0),
    PROCESSING_PURPOSE_NOTHING(21),
    PROVISION_OF_SERVICE(1),
    PROVISION_OF_SERVICE_INFRASTRUCTURE(18),
    ADS_RELATED_PROVISION_OF_SERVICE(2),
    PRODUCT_PERSONALIZATION(3),
    CONTEXTUALIZATION(23),
    REVENUE_GENERATION(4),
    USER_SUPPORT(5),
    CLOUD_PROCESSING_INFRASTRUCTURE(22),
    CLOUD_PROCESSING_INFRASTRUCTURE_VALIDATION(33),
    ACCOUNT_MANAGEMENT(24),
    USER_COMMUNICATIONS(25),
    MODEL_TRAINING(30),
    VERIFICATION_TESTING_VALIDATION(6),
    DEBUGGING_AND_MONITORING(7),
    INFRASTRUCTURE_METRICS(8),
    DATA_RECOVERY(26),
    BUSINESS_ANALYSIS(9),
    MARKET_RESEARCH(10),
    RESEARCH_EXPERIMENTATION(11),
    TRUST_SAFETY(12),
    TRUST_SAFETY_ANTI_FRAUD(15),
    TRUST_SAFETY_ANTI_SPAM(16),
    TRUST_SAFETY_SECURITY(17),
    TRUST_SAFETY_ANTI_ABUSE(19),
    COMPLIANCE_LEGAL_SUPPORT(13),
    LIMITED_MANUAL_ACCESS(14),
    COMPLIANCE_LEGAL_SUPPORT_TAKEOUT(20),
    COMPLIANCE_LEGAL_SUPPORT_TAKEOUT_LEGAL(27),
    COMPLIANCE_LEGAL_SUPPORT_TAKEOUT_CONSUMER(28),
    COMPLIANCE_LEGAL_SUPPORT_ELI(29),
    EXP_MODEL_TRAINING_FOR_PRODUCTION(31),
    MODEL_GROUNDING(32),
    UNRECOGNIZED(-1);

    private final int K;

    abrd(int i) {
        this.K = i;
    }

    @Override // defpackage.abxf
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.K;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.K);
    }
}
