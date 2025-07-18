package defpackage;

import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class txn extends LogRecord {
    private static final Object[] b;
    public final twr a;
    private final tvu c;

    static {
        new txm();
        b = new Object[0];
    }

    protected txn(tvu tvuVar, twa twaVar) {
        super(tvuVar.p(), null);
        this.c = tvuVar;
        this.a = twr.g(twaVar, tvuVar.l());
        tuq tuqVarF = tvuVar.f();
        setSourceClassName(tuqVarF.b());
        setSourceMethodName(tuqVarF.d());
        setLoggerName(tvuVar.o());
        setMillis(TimeUnit.NANOSECONDS.toMillis(tvuVar.e()));
        super.setParameters(b);
    }

    public static void a(tvu tvuVar, StringBuilder sb) {
        sb.append("  original message: ");
        if (tvuVar.m() == null) {
            sb.append(tvy.b(tvuVar.n()));
        } else {
            sb.append(tvuVar.m().b);
            sb.append("\n  original arguments:");
            for (Object obj : tvuVar.K()) {
                sb.append("\n    ");
                sb.append(tvy.b(obj));
            }
        }
        twa twaVarL = tvuVar.l();
        if (twaVarL.b() > 0) {
            sb.append("\n  metadata:");
            for (int i = 0; i < twaVarL.b(); i++) {
                sb.append("\n    ");
                sb.append(twaVarL.c(i).a);
                sb.append(": ");
                sb.append(tvy.b(twaVarL.e(i)));
            }
        }
        sb.append("\n  level: ");
        sb.append(tvy.b(tvuVar.p()));
        sb.append("\n  timestamp (nanos): ");
        sb.append(tvuVar.e());
        sb.append("\n  class: ");
        sb.append(tvuVar.f().b());
        sb.append("\n  method: ");
        sb.append(tvuVar.f().d());
        sb.append("\n  line number: ");
        sb.append(tvuVar.f().a());
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Set] */
    @Override // java.util.logging.LogRecord
    public final String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            tvu tvuVar = this.c;
            twr twrVar = this.a;
            tvv tvvVar = twv.a;
            if (twv.b(tvuVar, twrVar, tvvVar.b)) {
                StringBuilder sb = new StringBuilder();
                tyi.e(tvuVar, sb);
                twv.c(twrVar, (twh) tvvVar.a, sb);
                message = sb.toString();
            } else {
                message = twv.a(tvuVar);
            }
            super.setMessage(message);
        }
        return message;
    }

    @Override // java.util.logging.LogRecord
    public final void setMessage(String str) {
        if (str == null) {
            str = "";
        }
        super.setMessage(str);
    }

    @Override // java.util.logging.LogRecord
    public final void setParameters(Object[] objArr) {
        getMessage();
        if (objArr == null) {
            objArr = b;
        }
        super.setParameters(objArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" {\n  message: ");
        sb.append(getMessage());
        sb.append("\n  arguments: ");
        sb.append(getParameters() != null ? Arrays.asList(getParameters()) : "<none>");
        sb.append('\n');
        a(this.c, sb);
        sb.append("\n}");
        return sb.toString();
    }

    public txn(tvu tvuVar, twa twaVar, byte[] bArr) {
        this(tvuVar, twaVar);
        setThrown((Throwable) this.a.b(tul.a));
        getMessage();
    }

    public txn(RuntimeException runtimeException, tvu tvuVar, twa twaVar) {
        this(tvuVar, twaVar);
        setLevel(tvuVar.p().intValue() < Level.WARNING.intValue() ? Level.WARNING : tvuVar.p());
        setThrown(runtimeException);
        StringBuilder sb = new StringBuilder("LOGGING ERROR: ");
        sb.append(runtimeException.getMessage());
        sb.append('\n');
        a(tvuVar, sb);
        setMessage(sb.toString());
    }

    @Override // java.util.logging.LogRecord
    public final void setResourceBundle(ResourceBundle resourceBundle) {
    }

    @Override // java.util.logging.LogRecord
    public final void setResourceBundleName(String str) {
    }
}
