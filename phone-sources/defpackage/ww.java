package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ww extends CancellationException {
    public ww(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(wx.a);
        return this;
    }
}
