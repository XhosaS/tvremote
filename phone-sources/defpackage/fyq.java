package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fyq implements yjv {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fyq(int i) {
        this.b = i;
        this.a = "SELECT DISTINCT work_spec_id FROM SystemIdInfo";
    }

    /* JADX WARN: Removed duplicated region for block: B:98:0x0177  */
    /* JADX WARN: Type inference failed for: r8v29, types: [java.lang.Object, ysn] */
    /* JADX WARN: Type inference failed for: r8v39, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r8v42, types: [java.lang.Object, yjv] */
    @Override // defpackage.yjv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fyq.a(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ fyq(int i, byte[] bArr) {
        this.b = i;
        this.a = "DELETE FROM WorkProgress";
    }

    public /* synthetic */ fyq(int i, char[] cArr) {
        this.b = i;
        this.a = "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)";
    }

    public /* synthetic */ fyq(int i, float[] fArr) {
        this.b = i;
        this.a = "SELECT * FROM workspec WHERE state=1";
    }

    public /* synthetic */ fyq(int i, int[] iArr) {
        this.b = i;
        this.a = "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
    }

    public /* synthetic */ fyq(int i, short[] sArr) {
        this.b = i;
        this.a = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1";
    }

    public /* synthetic */ fyq(int i, boolean[] zArr) {
        this.b = i;
        this.a = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1";
    }

    public /* synthetic */ fyq(int i, byte[][] bArr) {
        this.b = i;
        this.a = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time";
    }

    public /* synthetic */ fyq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
