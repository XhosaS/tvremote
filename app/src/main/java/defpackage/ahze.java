package defpackage;

import android.net.http.HttpException;
import org.chromium.net.CronetException;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ahze extends CronetException {
    public ahze(HttpException httpException) {
        super(httpException.getMessage(), httpException);
    }
}
