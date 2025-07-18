package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class krk implements idb {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ krk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v62, types: [iea, java.lang.Object] */
    @Override // defpackage.idb
    public final boolean a() {
        switch (this.b) {
            case 1:
                if (((Integer) ((kqf) this.a).c.a()).intValue() != 1) {
                }
                break;
            case 2:
                tui tuiVar = lkp.a;
                break;
            case 3:
                lmd lmdVar = ((lkp) this.a).I;
                if (lmdVar == null || !lmdVar.d) {
                }
                break;
            case 4:
                if (((lkp) this.a).I != null) {
                }
                break;
        }
        return ((Boolean) this.a.a()).booleanValue();
    }

    public krk(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
