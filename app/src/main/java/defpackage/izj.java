package defpackage;

import android.database.Cursor;
import android.util.Log;
import j$.time.Instant;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class izj extends agtu implements agvb {
    int a;
    final /* synthetic */ izo b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izj(izo izoVar, String str, agsw agswVar) {
        super(2, agswVar);
        this.b = izoVar;
        this.c = str;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((izj) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Throwable {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        izo izoVar = this.b;
        final String str = this.c;
        str.getClass();
        zyd zydVarC = izoVar.a.a.c(new uqj() { // from class: hve
            @Override // defpackage.uqj
            public final Object a(uqk uqkVar) throws InterruptedException {
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList = new ArrayList();
                sb.append("\n      SELECT search_id,\n      search_term,\n      assistant_visual_element,\n      image_primary_entity_mid,\n      timestamp_ms,\n      event_id,\n      account_name\n      FROM recent_search\n      WHERE account_name = ?\n      ORDER BY timestamp_ms DESC LIMIT ?\n      ");
                arrayList.add(str);
                arrayList.add(10L);
                uqg uqgVarA = uqh.a(sb, arrayList);
                uqk.b();
                if (Log.isLoggable("ASQLDB", 2)) {
                    Log.v("ASQLDB", uqk.a(uqkVar.b.rawQueryWithFactory(new uqi(uqgVarA.b), "EXPLAIN QUERY PLAN ".concat(uqgVarA.a), null, null)));
                }
                String str2 = uqgVarA.a;
                wvx wvxVarF = wzg.f("Query: ".concat(str2), wwb.a, true);
                try {
                    Cursor cursorRawQueryWithFactory = uqkVar.b.rawQueryWithFactory(new uqi(uqgVarA.b), str2, null, null, uqkVar.a);
                    wvxVarF.close();
                    try {
                        cursorRawQueryWithFactory.getClass();
                        ArrayDeque arrayDeque = new ArrayDeque();
                        if (cursorRawQueryWithFactory.moveToFirst()) {
                            do {
                                String string = cursorRawQueryWithFactory.getString(1);
                                String string2 = cursorRawQueryWithFactory.getString(6);
                                String string3 = cursorRawQueryWithFactory.getString(5);
                                string3.getClass();
                                Integer numValueOf = Integer.valueOf(cursorRawQueryWithFactory.getInt(2));
                                String string4 = cursorRawQueryWithFactory.getString(3);
                                Instant instant = Instant.parse(cursorRawQueryWithFactory.getString(4));
                                instant.getClass();
                                arrayDeque.addFirst(new hvg(string, string2, string3, numValueOf, string4, instant, Integer.valueOf(cursorRawQueryWithFactory.getInt(0))));
                            } while (cursorRawQueryWithFactory.moveToNext());
                        }
                        aguc.a(cursorRawQueryWithFactory, null);
                        return arrayDeque;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            aguc.a(cursorRawQueryWithFactory, th);
                            throw th2;
                        }
                    }
                } finally {
                }
            }
        });
        zydVarC.getClass();
        this.a = 1;
        Object objB = ahkr.b(zydVarC, this);
        return objB == agtgVar ? agtgVar : objB;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new izj(this.b, this.c, agswVar);
    }
}
