package defpackage;

import android.os.Looper;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mvb implements nzy {
    private final aehf a;
    private final agfx b;

    public mvb(aehf aehfVar, agfx agfxVar) {
        this.a = aehfVar;
        this.b = agfxVar;
    }

    @Override // defpackage.nzz
    public final abwk a() {
        return acvd.b;
    }

    @Override // defpackage.nzy
    public final /* synthetic */ agff b(Object obj, nzx nzxVar) {
        agff agffVarC;
        acvd acvdVar = (acvd) obj;
        if ((acvdVar.c & 2) != 0) {
            oaa oaaVar = (oaa) this.a.a();
            CommandOuterClass$Command defaultInstance = acvdVar.e;
            if (defaultInstance == null) {
                defaultInstance = CommandOuterClass$Command.getDefaultInstance();
            }
            agffVarC = oaaVar.c(defaultInstance, nzxVar);
        } else {
            agffVarC = agij.a;
            aggz aggzVar = agoh.n;
        }
        float f = acvdVar.d;
        if (f <= 0.0f) {
            return agffVarC;
        }
        double d = f;
        agfx agfxVar = this.b;
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        aghn.b(timeUnit, "unit is null");
        agjc agjcVar = new agjc((long) (d * 1000000.0d), timeUnit, agfxVar);
        aggz aggzVar2 = agoh.n;
        agid agidVar = new agid(agjcVar, agffVarC);
        aggz aggzVar3 = agoh.n;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return agidVar;
        }
        agfx agfxVar2 = aggd.a;
        aggb.a(agfxVar2);
        return agidVar.i(agfxVar2);
    }
}
