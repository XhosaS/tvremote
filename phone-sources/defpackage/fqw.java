package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqw {
    public static final ImmutableList a = ImmutableList.of(40010);
    static final ImmutableList b = ImmutableList.of(50000, 50001, 50002, 50003, 50004, 50005, 50006);
    public static final String c = edt.Z(0);
    public static final String d = edt.Z(1);
    public static final String e = edt.Z(2);
    public final int f;
    public final String g;
    public final Bundle h;

    public fqw(int i) {
        eci.a(i != 0, "commandCode shouldn't be COMMAND_CODE_CUSTOM");
        this.f = i;
        this.g = "";
        this.h = Bundle.EMPTY;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(c, this.f);
        bundle.putString(d, this.g);
        bundle.putBundle(e, this.h);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fqw)) {
            return false;
        }
        fqw fqwVar = (fqw) obj;
        return this.f == fqwVar.f && TextUtils.equals(this.g, fqwVar.g);
    }

    public final int hashCode() {
        return Objects.hash(this.g, Integer.valueOf(this.f));
    }

    public fqw(String str, Bundle bundle) {
        this.f = 0;
        str.getClass();
        this.g = str;
        bundle.getClass();
        this.h = new Bundle(bundle);
    }
}
