package defpackage;

import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class zhn extends LogRecord {
    private static final Object[] b;
    public final zgo a;
    private final zfp c;

    static {
        new zhm();
        b = new Object[0];
    }

    protected zhn(zfp zfpVar, zfx zfxVar) {
        super(zfpVar.g(), null);
        this.c = zfpVar;
        this.a = zgo.g(zfxVar, zfpVar.c());
        zei zeiVarB = zfpVar.b();
        setSourceClassName(zeiVarB.b());
        setSourceMethodName(zeiVarB.e());
        setLoggerName(zfpVar.f());
        setMillis(TimeUnit.NANOSECONDS.toMillis(zfpVar.a()));
        super.setParameters(b);
    }

    public static void a(zfp zfpVar, StringBuilder sb) {
        String strA;
        String strA2;
        String strA3;
        String strA4;
        sb.append("  original message: ");
        if (zfpVar.d() == null) {
            Object objE = zfpVar.e();
            try {
                strA4 = zfv.b(objE);
            } catch (RuntimeException e) {
                strA4 = zfv.a(objE, e);
            }
            sb.append(strA4);
        } else {
            sb.append(zfpVar.d().b);
            sb.append("\n  original arguments:");
            for (Object obj : zfpVar.i()) {
                sb.append("\n    ");
                try {
                    strA = zfv.b(obj);
                } catch (RuntimeException e2) {
                    strA = zfv.a(obj, e2);
                }
                sb.append(strA);
            }
        }
        zfx zfxVarC = zfpVar.c();
        if (zfxVarC.a() > 0) {
            sb.append("\n  metadata:");
            for (int i = 0; i < zfxVarC.a(); i++) {
                sb.append("\n    ");
                sb.append(zfxVarC.b(i).a);
                sb.append(": ");
                Object objD = zfxVarC.d(i);
                try {
                    strA3 = zfv.b(objD);
                } catch (RuntimeException e3) {
                    strA3 = zfv.a(objD, e3);
                }
                sb.append(strA3);
            }
        }
        sb.append("\n  level: ");
        Level levelG = zfpVar.g();
        try {
            strA2 = zfv.b(levelG);
        } catch (RuntimeException e4) {
            strA2 = zfv.a(levelG, e4);
        }
        sb.append(strA2);
        sb.append("\n  timestamp (nanos): ");
        sb.append(zfpVar.a());
        sb.append("\n  class: ");
        sb.append(zfpVar.b().b());
        sb.append("\n  method: ");
        sb.append(zfpVar.b().e());
        sb.append("\n  line number: ");
        sb.append(zfpVar.b().a());
    }

    @Override // java.util.logging.LogRecord
    public final String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            zfp zfpVar = this.c;
            zgo zgoVar = this.a;
            zgs zgsVar = (zgs) zgt.a;
            if (zgt.b(zfpVar, zgoVar, zgsVar.b)) {
                StringBuilder sb = new StringBuilder();
                zfk.c(zfpVar, sb);
                zgt.c(zgoVar, zgsVar.a, sb);
                message = sb.toString();
            } else {
                message = zgt.a(zfpVar);
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

    @Override // java.util.logging.LogRecord
    public final void setResourceBundle(ResourceBundle resourceBundle) {
    }

    @Override // java.util.logging.LogRecord
    public final void setResourceBundleName(String str) {
    }
}
