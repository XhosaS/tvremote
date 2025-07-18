package defpackage;

import android.content.Context;
import com.google.android.libraries.notifications.internal.storage.impl.room.ChimePerAccountRoomDatabase;
import com.google.android.libraries.notifications.platform.internal.room.GnpPerAccountRoomDatabase;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class qal implements qdx {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ qal(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yil] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, yil] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, yfo] */
    @Override // defpackage.qdx
    public final Object a(qen qenVar) {
        int i = this.c;
        if (i == 0) {
            String strValueOf = qenVar != null ? Long.valueOf(qenVar.a) : "device_level";
            ?? r0 = this.b;
            Object obj = this.a;
            Objects.toString(strValueOf);
            gev gevVarD = gez.d((Context) obj, ChimePerAccountRoomDatabase.class, strValueOf.toString().concat("_room_notifications.db"));
            gevVarD.e(r0);
            return (ChimePerAccountRoomDatabase) gevVarD.a();
        }
        if (i == 1) {
            ChimePerAccountRoomDatabase chimePerAccountRoomDatabase = (ChimePerAccountRoomDatabase) ((rbi) this.b).f(qenVar);
            chimePerAccountRoomDatabase.getClass();
            nsf nsfVar = (nsf) this.a;
            yil yilVarA = ((mdx) nsfVar.a).a();
            ((osk) nsfVar.b.b()).getClass();
            return new qap(chimePerAccountRoomDatabase, yilVarA);
        }
        if (i == 2) {
            gev gevVarD2 = gez.d((Context) this.a, GnpPerAccountRoomDatabase.class, qtl.U(qenVar));
            gevVarD2.e(this.b);
            return (GnpPerAccountRoomDatabase) gevVarD2.a();
        }
        GnpPerAccountRoomDatabase gnpPerAccountRoomDatabase = (GnpPerAccountRoomDatabase) ((rbi) this.a).f(qenVar);
        gnpPerAccountRoomDatabase.getClass();
        rbi rbiVar = (rbi) this.b;
        yil yilVarA2 = ((mdx) rbiVar.b).a();
        ((osk) rbiVar.a.b()).getClass();
        return new qob(gnpPerAccountRoomDatabase, yilVarA2);
    }

    public /* synthetic */ qal(rbi rbiVar, rbi rbiVar2, int i) {
        this.c = i;
        this.b = rbiVar;
        this.a = rbiVar2;
    }
}
