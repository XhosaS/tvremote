package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xls implements xlr {

    @Deprecated
    public static final ryn a = xhf.b.d("SabrinaKidsModeNoSoundTempWorkaroundFeature__enabled", true);
    private final Context b;

    public xls(Context context) {
        this.b = context;
    }

    @Override // defpackage.xlr
    public final boolean a() {
        return ((Boolean) a.et(this.b)).booleanValue();
    }
}
