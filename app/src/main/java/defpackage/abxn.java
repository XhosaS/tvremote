package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abxn {
    final /* synthetic */ abxf a;

    public abxn(abxf abxfVar) {
        this.a = abxfVar;
    }

    public final abxf a(Integer num) {
        adlm adlmVarB = adlm.b(num.intValue());
        return adlmVarB == null ? this.a : adlmVarB;
    }

    public final Integer b(abxf abxfVar) {
        return Integer.valueOf(abxfVar.a());
    }
}
