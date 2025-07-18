package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mbj implements Runnable {
    public final lzw a;
    public final lhr b;
    public final uof c;
    private final idy d;
    private final lqs e;
    private final kuw f;
    private final gag g;

    public mbj(kuw kuwVar, gag gagVar, lzw lzwVar, lqs lqsVar, idy idyVar, lhr lhrVar, uof uofVar) {
        this.f = kuwVar;
        this.g = gagVar;
        this.a = lzwVar;
        this.e = lqsVar;
        this.d = idyVar;
        this.b = lhrVar;
        this.c = uofVar;
    }

    private final void a(ltr ltrVar) {
        ieg iegVar = (ieg) this.e.b(ltrVar);
        if (iegVar.m()) {
            this.a.a(ltrVar.b, ((lts) iegVar.g()).a);
        } else {
            krd.c("Failed to fetch watch events: ".concat(String.valueOf(String.valueOf(ltrVar.a))));
            this.d.c(iegVar.i());
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        kuw kuwVar = this.f;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) kuwVar.a;
        uof uofVar = this.c;
        Object obj = uofVar.c;
        Long l = (Long) concurrentHashMap.get(obj);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (l == null || l.longValue() > jCurrentTimeMillis || l.longValue() + 86400000 < jCurrentTimeMillis) {
            kuwVar.s((ksn) obj);
        } else {
            krd.e("Skipping sync of user config, will use defaults");
        }
        int i = 13;
        int i2 = 11;
        byte[] bArr = null;
        if (!uofVar.a) {
            mbi mbiVar = new mbi(this);
            gag gagVar = this.g;
            Object obj2 = uofVar.b;
            vtw vtwVarM = vbz.a.m();
            String str = (String) obj2;
            vtwVarM.aw(kgu.o(ksy.i(str)));
            vtwVarM.aw(kgu.o(ksy.h(str)));
            vbz vbzVar = (vbz) vtwVarM.r();
            vtw vtwVarM2 = veh.a.m();
            ksn ksnVar = (ksn) obj;
            vdn vdnVarC = ((moz) gagVar.c).c(ksnVar);
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            veh vehVar = (veh) vtwVarM2.b;
            vdnVarC.getClass();
            vehVar.c = vdnVarC;
            vehVar.b = 1 | vehVar.b;
            vtw vtwVarM3 = veg.a.m();
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            veg vegVar = (veg) vtwVarM3.b;
            vbzVar.getClass();
            vegVar.c = vbzVar;
            vegVar.b |= 2;
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            veh vehVar2 = (veh) vtwVarM2.b;
            veg vegVar2 = (veg) vtwVarM3.r();
            vegVar2.getClass();
            vehVar2.d = vegVar2;
            vehVar2.b |= 2;
            ieg iegVarU = gagVar.u(ksnVar, mbiVar, (veh) vtwVarM2.r());
            if (!iegVarU.m()) {
                krd.c("Failed to sync purchase for ".concat(String.valueOf(obj2)));
                this.d.c(iegVarU.i());
                return;
            }
            ImmutableList immutableListA = mbiVar.a();
            lzw lzwVar = this.a;
            ImmutableSet set = FluentIterable.from(immutableListA).transform(new lsq(i2)).toSet();
            ImmutableList.Builder builder = ImmutableList.builder();
            if (!set.contains(ksy.i(str))) {
                builder.add((ImmutableList.Builder) ksy.i(str));
            }
            if (!set.contains(ksy.h(str))) {
                builder.add((ImmutableList.Builder) ksy.h(str));
            }
            SQLiteDatabase sQLiteDatabaseA = lzwVar.b.a();
            try {
                lzwVar.b.f(sQLiteDatabaseA, lzw.b(sQLiteDatabaseA, (ksn) obj, builder.build()), 0);
                if (immutableListA.isEmpty()) {
                    return;
                }
                lhr lhrVar = this.b;
                lhrVar.c.execute(new ljl(((jzs) lhrVar.d).l((ksn) lhrVar.f, FluentIterable.from(immutableListA).transform(new lsq(i)).toList(), false), 10, bArr));
                nwo nwoVar = new nwo((byte[]) null, (char[]) null);
                nwoVar.b = obj;
                nwoVar.h(str);
                a(nwoVar.g());
                return;
            } finally {
            }
        }
        mbi mbiVar2 = new mbi(this);
        gag gagVar2 = this.g;
        vtw vtwVarM4 = veh.a.m();
        ksn ksnVar2 = (ksn) obj;
        vdn vdnVarC2 = ((moz) gagVar2.c).c(ksnVar2);
        if (!vtwVarM4.b.A()) {
            vtwVarM4.u();
        }
        veh vehVar3 = (veh) vtwVarM4.b;
        vdnVarC2.getClass();
        vehVar3.c = vdnVarC2;
        vehVar3.b |= 1;
        ieg iegVarU2 = gagVar2.u(ksnVar2, mbiVar2, (veh) vtwVarM4.r());
        if (!iegVarU2.m()) {
            krd.c("Failed to sync user's library");
            this.d.c(iegVarU2.i());
            return;
        }
        ImmutableList immutableListA2 = mbiVar2.a();
        lzw lzwVar2 = this.a;
        ImmutableSet set2 = FluentIterable.from(immutableListA2).transform(new lsq(i2)).toSet();
        SQLiteDatabase sQLiteDatabaseA2 = lzwVar2.b.a();
        try {
            ImmutableList.Builder builder2 = ImmutableList.builder();
            Cursor cursorQuery = sQLiteDatabaseA2.query("purchased_assets", new String[]{"asset_type", "asset_id"}, "account = ?", new String[]{((ksn) obj).a}, null, null, null);
            try {
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("asset_type");
                int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("asset_id");
                while (cursorQuery.moveToNext()) {
                    builder2.add((ImmutableList.Builder) ksy.c(cursorQuery.getInt(columnIndexOrThrow), cursorQuery.getString(columnIndexOrThrow2)));
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                lzwVar2.b.f(sQLiteDatabaseA2, lzw.b(sQLiteDatabaseA2, (ksn) obj, ImmutableList.copyOf((Collection) Sets.difference(ImmutableSet.copyOf((Collection) builder2.build()), set2))), 0);
                if (!immutableListA2.isEmpty()) {
                    lhr lhrVar2 = this.b;
                    lhrVar2.c.execute(new ljl(((jzs) lhrVar2.d).l((ksn) lhrVar2.f, FluentIterable.from(immutableListA2).transform(new lsq(i)).toList(), true), 10, bArr));
                    nwo nwoVar2 = new nwo((byte[]) null, (char[]) null);
                    nwoVar2.b = obj;
                    a(nwoVar2.g());
                }
                try {
                    ((ufb) ((kuw) this.b.e).b(false)).s();
                } catch (Exception unused) {
                    krd.f("Unable to rebuild indices");
                }
            } finally {
            }
        } finally {
        }
    }
}
