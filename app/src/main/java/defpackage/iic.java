package defpackage;

import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class iic extends ikr {
    public static final zdy d = zdy.h("com/google/android/apps/tvsearch/setup/fragment/AssistantEntryFragment");
    public static final yyk e = yyk.q(2990L, 3340L, 1728L);
    public static final yyk f = yyk.q(3880L, 1710L, 1100L);
    public int ah = 0;

    @Override // defpackage.ats
    public final int aB() {
        return R.style.AssistantValuePropGuidedStep;
    }

    @Override // defpackage.ikr, defpackage.ats
    public final axe aD() {
        return new ihy(this);
    }

    @Override // defpackage.ats
    public final ayc aF() {
        return new iib(this);
    }

    public abstract void aS(ayb aybVar, axh axhVar);
}
