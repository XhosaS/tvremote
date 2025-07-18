package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gk implements yjv {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ gk(gox goxVar, String str, int i) {
        this.d = i;
        this.c = "UPDATE workspec SET output=? WHERE id=?";
        this.a = goxVar;
        this.b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0423  */
    /* JADX WARN: Type inference failed for: r0v15, types: [bte, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object, yow] */
    /* JADX WARN: Type inference failed for: r0v79, types: [dvk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [dvk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, yqe] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r2v3, types: [dvk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object, yow] */
    /* JADX WARN: Type inference failed for: r2v43, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r2v44, types: [bvv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v61, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r2v64, types: [java.lang.Object, yrz] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r3v35, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r5v22, types: [ams, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.lang.Object, yjk] */
    @Override // defpackage.yjv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r50) {
        /*
            Method dump skipped, instructions count: 1496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk.a(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ gk(gpx gpxVar, String str, int i) {
        this.d = i;
        this.c = "UPDATE workspec SET state=? WHERE id=?";
        this.a = gpxVar;
        this.b = str;
    }

    public /* synthetic */ gk(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ gk(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ gk(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ gk(Object obj, Object obj2, Object obj3, int i, int[] iArr) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ gk(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ gk(String str, gvf gvfVar, int i) {
        this.d = i;
        this.c = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        this.b = str;
        this.a = gvfVar;
    }
}
