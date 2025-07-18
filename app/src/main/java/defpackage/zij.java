package defpackage;

import java.util.Calendar;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zij extends zik {
    private final zii c;

    public zij(zfm zfmVar, int i, zii ziiVar) {
        super(zfmVar, i);
        this.c = ziiVar;
        StringBuilder sb = new StringBuilder("%");
        zfmVar.f(sb);
        sb.append(true != zfmVar.d() ? 't' : 'T');
        sb.append(ziiVar.G);
    }

    @Override // defpackage.zik
    public final void a(zil zilVar, Object obj) {
        zii ziiVar = this.c;
        if (!(obj instanceof Date) && !(obj instanceof Calendar) && !(obj instanceof Long)) {
            zfk.a(((zfk) zilVar).b, obj, "%t" + ziiVar.G);
            return;
        }
        zfm zfmVar = this.b;
        StringBuilder sb = new StringBuilder("%");
        zfmVar.f(sb);
        sb.append(true != zfmVar.d() ? 't' : 'T');
        sb.append(ziiVar.G);
        ((zfk) zilVar).b.append(String.format(zfv.a, sb.toString(), obj));
    }
}
