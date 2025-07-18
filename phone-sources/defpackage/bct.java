package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bct implements yjv {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bct(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object, yqe] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r7v29, types: [java.lang.Object, yrz] */
    /* JADX WARN: Type inference failed for: r7v39, types: [dvk, java.lang.Object] */
    @Override // defpackage.yjv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r7) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 790
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bct.a(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ bct(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ bct(String str, int i) {
        this.c = i;
        this.b = "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?";
        this.a = str;
    }

    public /* synthetic */ bct(String str, int i, byte[] bArr) {
        this.c = i;
        this.b = "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)";
        this.a = str;
    }

    public /* synthetic */ bct(String str, int i, char[] cArr) {
        this.c = i;
        this.b = "SELECT long_value FROM Preference where `key`=?";
        this.a = str;
    }

    public /* synthetic */ bct(String str, int i, short[] sArr) {
        this.c = i;
        this.b = "DELETE FROM SystemIdInfo where work_spec_id=?";
        this.a = str;
    }
}
