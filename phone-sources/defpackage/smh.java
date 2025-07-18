package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class smh implements uga {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ smh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, smx] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, uhp] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.uga
    public final uge a(ulp ulpVar, Object obj) {
        int i = this.b;
        if (i == 0) {
            return new uge(((sml) obj).a(this.a));
        }
        if (i != 1) {
            int i2 = 3;
            if (i == 2) {
                return new uge(((sml) obj).a(new ped(this.a, i2)));
            }
            if (i != 3) {
                return new uge(this.a);
            }
            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
            boolean zIsWriteAheadLoggingEnabled = sQLiteDatabase.isWriteAheadLoggingEnabled();
            smq smqVar = (smq) this.a;
            Executor executor = smqVar.i;
            sml smlVar = zIsWriteAheadLoggingEnabled ? new sml(sQLiteDatabase, smqVar.c, executor, smqVar.p) : new sml(sQLiteDatabase, executor, executor, smqVar.p);
            return smq.a(sfy.C(smlVar), new rts(smlVar, 2));
        }
        sml smlVar2 = (sml) obj;
        smlVar2.b();
        rzy rzyVar = (rzy) this.a;
        uoo uooVar = new uoo(smlVar2, (Object[]) rzyVar.b, (String) rzyVar.a);
        int i3 = smt.a;
        sms smsVar = new sms(uooVar);
        smlVar2.c.execute(trc.f(smsVar));
        ugk ugkVar = ugk.a;
        uho uhoVar = uge.a;
        ugkVar.getClass();
        uge ugeVar = new uge(sfy.D(smsVar));
        sfy.K(smsVar, new rhx(ugeVar, (Executor) ugkVar, 2), ugkVar);
        return ugeVar;
    }
}
