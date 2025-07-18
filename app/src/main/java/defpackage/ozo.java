package defpackage;

import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ozo extends oxp {
    private final ozi a;
    private final String b;

    public ozo(ozi oziVar, String str) {
        this.a = oziVar;
        this.b = str;
    }

    @Override // defpackage.oxp
    public final /* bridge */ /* synthetic */ ozl a(MessageLite messageLite) {
        abft abftVar = (abft) messageLite;
        abftVar.getClass();
        return new oyl(this.a, abftVar, this.b);
    }

    @Override // defpackage.oxp
    public final /* bridge */ /* synthetic */ String c(MessageLite messageLite) {
        abft abftVar = (abft) messageLite;
        abftVar.getClass();
        abfv abfvVar = abftVar.c;
        if (abfvVar == null) {
            abfvVar = abfv.a;
        }
        String strA = paf.a(abfvVar);
        strA.getClass();
        return strA;
    }
}
