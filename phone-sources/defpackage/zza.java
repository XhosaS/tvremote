package defpackage;

import android.net.http.HttpException;
import org.chromium.net.CronetException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zza extends CronetException {
    public zza(HttpException httpException) {
        super(httpException.getMessage(), httpException);
    }
}
