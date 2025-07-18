package defpackage;

import com.google.android.libraries.notifications.platform.internal.room.GnpRoomDatabase;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qoe implements xcm {
    private final xcq a;
    private final xcq b;
    private final /* synthetic */ int c;

    public qoe(xcq xcqVar, xcq xcqVar2, int i) {
        this.c = i;
        this.a = xcqVar;
        this.b = xcqVar2;
    }

    public final qnr a() {
        if (this.c != 0) {
            GnpRoomDatabase gnpRoomDatabase = (GnpRoomDatabase) this.a.b();
            yil yilVarA = ((mdx) this.b).a();
            gnpRoomDatabase.getClass();
            qnt qntVarY = gnpRoomDatabase.y();
            qntVarY.getClass();
            return new qnx(qntVarY, yilVarA);
        }
        GnpRoomDatabase gnpRoomDatabase2 = (GnpRoomDatabase) this.a.b();
        yil yilVarA2 = ((mdx) this.b).a();
        gnpRoomDatabase2.getClass();
        qnt qntVarY2 = gnpRoomDatabase2.y();
        qntVarY2.getClass();
        return new qnx(qntVarY2, yilVarA2);
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        return this.c != 0 ? a() : a();
    }
}
