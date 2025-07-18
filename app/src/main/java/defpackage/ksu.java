package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
class ksu {
    public final lcq a;

    public ksu(lcq lcqVar) {
        this.a = lcqVar;
    }

    static ksu a(String str) {
        return new ksu((TextUtils.isEmpty(str) || str.length() > 1) ? lcq.UNINITIALIZED : lct.e(str.charAt(0)));
    }
}
