package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class eaq {
    static final String d = edt.Z(0);

    public static eaq c(Bundle bundle) {
        int i = bundle.getInt(d, -1);
        if (i == 0) {
            a.H(bundle.getInt(dzh.d, -1) == 0);
            return bundle.getBoolean(dzh.a, false) ? new dzh(bundle.getBoolean(dzh.b, false)) : new dzh();
        }
        if (i == 1) {
            a.H(bundle.getInt(eag.d, -1) == 1);
            float f = bundle.getFloat(eag.a, -1.0f);
            return f == -1.0f ? new eag() : new eag(f);
        }
        if (i != 2) {
            if (i != 3) {
                throw new IllegalArgumentException(a.cf(i, "Unknown RatingType: "));
            }
            a.H(bundle.getInt(eat.d, -1) == 3);
            return bundle.getBoolean(eat.a, false) ? new eat(bundle.getBoolean(eat.b, false)) : new eat();
        }
        a.H(bundle.getInt(ear.d, -1) == 2);
        int i2 = bundle.getInt(ear.a, 5);
        float f2 = bundle.getFloat(ear.b, -1.0f);
        return f2 == -1.0f ? new ear(i2) : new ear(i2, f2);
    }

    public abstract Bundle a();

    public abstract boolean b();
}
