package defpackage;

import java.util.Calendar;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tyd extends tye {
    private final tyc c;

    public tyd(tvr tvrVar, int i, tyc tycVar) {
        super(tvrVar, i);
        this.c = tycVar;
        StringBuilder sb = new StringBuilder("%");
        tvrVar.f(sb);
        sb.append(true != tvrVar.d() ? 't' : 'T');
        sb.append(tycVar.G);
    }

    @Override // defpackage.tye
    public final void a(tyi tyiVar, Object obj) {
        tyc tycVar = this.c;
        if (!(obj instanceof Date) && !(obj instanceof Calendar) && !(obj instanceof Long)) {
            tyi.c(tyiVar.d, obj, "%t" + tycVar.G);
            return;
        }
        tvr tvrVar = this.b;
        StringBuilder sb = new StringBuilder("%");
        tvrVar.f(sb);
        sb.append(true != tvrVar.d() ? 't' : 'T');
        sb.append(tycVar.G);
        tyiVar.d.append(String.format(tvy.a, sb.toString(), obj));
    }
}
