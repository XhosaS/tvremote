package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aec extends aeg {
    final /* synthetic */ agt a;
    private final aek b;

    public aec(agt agtVar, aek aekVar) {
        this.a = agtVar;
        this.b = aekVar;
    }

    @Override // defpackage.aeg
    public final void c(Status status) {
        try {
            if (status.a()) {
                agt agtVar = this.a;
                ael.c(agtVar.a.b).e();
                agtVar.k();
            } else {
                if (ael.c(this.a.a.b).b() != null) {
                    aei aeiVarB = aei.b();
                    aek aekVar = this.b;
                    String str = aekVar.a.a.f;
                    int i = aekVar.b;
                    aeiVarB.c(new aej(str, 1003, 1));
                }
            }
        } finally {
            aed.a.set(false);
        }
    }
}
