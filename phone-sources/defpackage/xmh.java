package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xmh implements xmg {

    @Deprecated
    public static final ryn a;

    @Deprecated
    public static final ryn b;
    private final Context c;

    static {
        rzy rzyVar = xhf.b;
        a = rzyVar.d("Support5gNetworkFeature__enabled", true);
        b = rzyVar.e("Support5gNetworkFeature__unmetered_eligigable_carriers_ids_list", new xde(11), "CgSjCa8O");
    }

    public xmh(Context context) {
        this.c = context;
    }

    @Override // defpackage.xmg
    public final vxh a() {
        return (vxh) b.et(this.c);
    }

    @Override // defpackage.xmg
    public final boolean b() {
        return ((Boolean) a.et(this.c)).booleanValue();
    }
}
