package defpackage;

import android.text.TextUtils;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
class afc extends afa {
    static final afc a = new afc();

    public afc() {
        super(null);
    }

    @Override // defpackage.afa
    protected final boolean b() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }
}
