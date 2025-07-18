package defpackage;

import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nhm extends UserRecoverableAuthException {
    public final int a;

    public nhm(int i, String str, Intent intent) {
        super(str, intent);
        this.a = i;
    }
}
