package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggf extends abww implements abyr {
    public ggf() {
        super(ggi.a);
    }

    public final void a(String str, String str2) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        ggi ggiVar = (ggi) this.b;
        ggi ggiVar2 = ggi.a;
        abyl abylVar = ggiVar.k;
        if (!abylVar.b) {
            ggiVar.k = abylVar.a();
        }
        ggiVar.k.put("APP_FLOW_TAG_FLOW_REQUEST_ID", str2);
    }
}
