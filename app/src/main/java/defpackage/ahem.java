package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahem extends CancellationException implements ahbf {
    public final transient ahdl a;

    public ahem(String str, ahdl ahdlVar) {
        super(str);
        this.a = ahdlVar;
    }

    @Override // defpackage.ahbf
    public final /* bridge */ /* synthetic */ Throwable a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        ahem ahemVar = new ahem(message, this.a);
        ahemVar.initCause(this);
        return ahemVar;
    }
}
