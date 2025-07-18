package defpackage;

import android.content.ContentResolver;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abtf implements abss {
    private final vrf a;

    public abtf(final ContentResolver contentResolver, Executor executor) {
        this.a = new vrf(new zvh() { // from class: abte
            @Override // defpackage.zvh
            public final zyd a() {
                absg absgVarC;
                yqt yqtVarH = yqt.h(lwy.a(contentResolver, "device_country", "unknown"));
                yqt yqtVarI = (!yqtVarH.g() || ((String) yqtVarH.c()).isEmpty() || ((String) yqtVarH.c()).toLowerCase(Locale.getDefault()).equals("unknown")) ? ypv.a : yqt.i((String) yqtVarH.c());
                if (yqtVarI.g()) {
                    int i = yyk.e;
                    yyf yyfVar = new yyf(4);
                    yyfVar.h(abtk.g);
                    if (!abtg.a.contains(((String) yqtVarI.c()).toLowerCase(Locale.getDefault()))) {
                        yyfVar.h(abtk.c);
                    }
                    if (!((String) yqtVarI.c()).toLowerCase(Locale.getDefault()).equals("de")) {
                        yyfVar.h(abtk.d);
                        yyfVar.h(abtk.e);
                        yyfVar.h(abtk.f);
                    }
                    absgVarC = absg.c(abtk.b(yyfVar.f()));
                } else {
                    absgVarC = absg.c(abtk.b(abtk.g));
                }
                return zxn.h(absgVarC);
            }
        }, executor);
    }

    @Override // defpackage.abss
    public final zyd a() {
        return this.a.b();
    }
}
