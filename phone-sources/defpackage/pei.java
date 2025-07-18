package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pei implements pdw {
    public final yfo a;
    final String b;
    final String c;
    private final pea d;

    public pei(pea peaVar, yfo yfoVar) {
        this.d = peaVar;
        this.b = "capped_promos";
        this.a = yfoVar;
        this.c = "noaccount";
    }

    public static rzy f(String str) {
        rzy rzyVar = new rzy((char[]) null);
        rzyVar.A("CREATE TABLE ");
        rzyVar.A(str);
        rzyVar.A(" (");
        rzyVar.A("account TEXT NOT NULL,");
        rzyVar.A("key TEXT NOT NULL,");
        rzyVar.A("value BLOB NOT NULL,");
        rzyVar.A(" PRIMARY KEY (account, key))");
        return rzyVar.H();
    }

    @Override // defpackage.pdw
    public final uhp a() {
        return this.d.d.aq(new ped(this, 0));
    }

    @Override // defpackage.pdw
    public final uhp b(final Map map) {
        return this.d.d.aq(new smx() { // from class: pee
            @Override // defpackage.smx
            public final Object a(rzy rzyVar) {
                pei peiVar = this.a;
                String str = peiVar.c;
                String str2 = peiVar.b;
                Integer numValueOf = Integer.valueOf(rzyVar.x(str2, "account = ?", str));
                for (Map.Entry entry : map.entrySet()) {
                    ContentValues contentValues = new ContentValues(3);
                    contentValues.put("account", str);
                    contentValues.put("key", (String) entry.getKey());
                    contentValues.put("value", ((vvj) entry.getValue()).h());
                    if (rzyVar.y(str2, contentValues, 5) == -1) {
                        throw new SQLException("Failed to clearAndPutAll() to DB.");
                    }
                }
                return numValueOf;
            }
        });
    }

    @Override // defpackage.pdw
    public final uhp c() {
        rzy rzyVar = new rzy((char[]) null);
        rzyVar.A("SELECT key, value");
        rzyVar.A(" FROM ");
        rzyVar.A(this.b);
        rzyVar.A(" WHERE account = ?");
        rzyVar.B(this.c);
        uge ugeVarAH = this.d.d.aH(rzyVar.H());
        final ugc ugcVar = new ugc() { // from class: peh
            @Override // defpackage.ugc
            public final Object a(ulp ulpVar, Object obj) {
                Cursor cursor = (Cursor) obj;
                HashMap mapNewHashMapWithExpectedSize = Maps.newHashMapWithExpectedSize(cursor.getCount());
                while (cursor.moveToNext()) {
                    mapNewHashMapWithExpectedSize.put(cursor.getString(cursor.getColumnIndexOrThrow("key")), vxr.j(cursor.getBlob(cursor.getColumnIndexOrThrow("value")), (vvj) this.a.a.b()));
                }
                return mapNewHashMapWithExpectedSize;
            }
        };
        int i = trc.a;
        final tqt tqtVarB = tqg.b();
        return ugeVarAH.a(new ugc() { // from class: tqx
            @Override // defpackage.ugc
            public final Object a(ulp ulpVar, Object obj) {
                int i2 = trc.a;
                ulpVar.getClass();
                tqt tqtVarE = tqg.e(tqg.d(), tqtVarB);
                try {
                    return ugcVar.a(ulpVar, obj);
                } finally {
                }
            }
        }, ugk.a).f();
    }

    @Override // defpackage.pdw
    public final uhp d(final String str, final vvj vvjVar) {
        return this.d.d.ar(new smy() { // from class: peg
            @Override // defpackage.smy
            public final void a(rzy rzyVar) {
                ContentValues contentValues = new ContentValues(3);
                pei peiVar = this.a;
                contentValues.put("account", peiVar.c);
                contentValues.put("key", str);
                contentValues.put("value", vvjVar.h());
                if (rzyVar.y(peiVar.b, contentValues, 5) == -1) {
                    throw new SQLException("Failed to put() to DB.");
                }
            }
        });
    }

    @Override // defpackage.pdw
    public final uhp e(final String str) {
        return this.d.d.ar(new smy() { // from class: pef
            @Override // defpackage.smy
            public final void a(rzy rzyVar) throws InterruptedException {
                pei peiVar = this.a;
                rzyVar.x(peiVar.b, "(account = ? AND key = ?)", peiVar.c, str);
            }
        });
    }

    public pei(pea peaVar, String str, qpv qpvVar, yfo yfoVar) {
        this.d = peaVar;
        this.b = str;
        this.a = yfoVar;
        this.c = !qpvVar.b() ? qpvVar.a() : "signedout";
    }
}
