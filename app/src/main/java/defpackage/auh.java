package defpackage;

import android.os.Bundle;
import androidx.preference.DialogPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class auh extends bq {
    private DialogPreference a;

    public auh() {
        auj.a(this);
    }

    @Override // defpackage.bq
    public void ey(Bundle bundle) {
        super.ey(bundle);
        bq bqVarEc = super.ec(true);
        if (!(bqVarEc instanceof bhr)) {
            throw new IllegalStateException(a.c(bqVarEc, "Target fragment ", " must implement TargetFragment interface"));
        }
    }

    public final DialogPreference l() {
        if (this.a == null) {
            this.a = (DialogPreference) ((bhr) super.ec(true)).cR(this.n.getString("key"));
        }
        return this.a;
    }
}
