package defpackage;

import android.database.Cursor;
import android.text.TextUtils;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pej implements ugc {
    private final /* synthetic */ int a;

    public /* synthetic */ pej(int i) {
        this.a = i;
    }

    @Override // defpackage.ugc
    public final Object a(ulp ulpVar, Object obj) {
        if (this.a == 0) {
            Cursor cursor = (Cursor) obj;
            tvn tvnVar = pel.a;
            ImmutableMap.Builder builder = ImmutableMap.builder();
            while (cursor.moveToNext()) {
                String string = cursor.getString(cursor.getColumnIndexOrThrow("node_id_path"));
                int i = cursor.getInt(cursor.getColumnIndexOrThrow("action"));
                int i2 = cursor.getInt(cursor.getColumnIndexOrThrow("event_count"));
                vtw vtwVarM = uzh.a.m();
                uzg uzgVarB = uzg.b(i);
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                uzh uzhVar = (uzh) vtwVarM.b;
                uzhVar.d = uzgVarB.e;
                uzhVar.b |= 1;
                String[] strArrSplit = TextUtils.split(string, ",");
                ArrayList arrayList = new ArrayList();
                for (String str : strArrSplit) {
                    arrayList.add(Integer.valueOf(Integer.parseInt(str)));
                }
                vtwVarM.as(arrayList);
                builder.put((uzh) vtwVarM.r(), Integer.valueOf(i2));
            }
            return builder.buildOrThrow();
        }
        Cursor cursor2 = (Cursor) obj;
        tvn tvnVar2 = pec.a;
        HashMap mapNewHashMapWithExpectedSize = Maps.newHashMapWithExpectedSize(cursor2.getCount());
        while (cursor2.moveToNext()) {
            int i3 = cursor2.getInt(cursor2.getColumnIndexOrThrow("log_source"));
            int i4 = cursor2.getInt(cursor2.getColumnIndexOrThrow("event_code"));
            String string2 = cursor2.getString(cursor2.getColumnIndexOrThrow("package_name"));
            int i5 = cursor2.getInt(cursor2.getColumnIndexOrThrow("event_count"));
            vtw vtwVarM2 = uxl.a.m();
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            vuc vucVar = vtwVarM2.b;
            uxl uxlVar = (uxl) vucVar;
            uxlVar.b |= 1;
            uxlVar.c = i3;
            if (!vucVar.A()) {
                vtwVarM2.u();
            }
            vuc vucVar2 = vtwVarM2.b;
            uxl uxlVar2 = (uxl) vucVar2;
            uxlVar2.b |= 2;
            uxlVar2.d = i4;
            if (!vucVar2.A()) {
                vtwVarM2.u();
            }
            uxl uxlVar3 = (uxl) vtwVarM2.b;
            string2.getClass();
            uxlVar3.b |= 4;
            uxlVar3.e = string2;
            mapNewHashMapWithExpectedSize.put((uxl) vtwVarM2.r(), Integer.valueOf(i5));
        }
        return DesugarCollections.unmodifiableMap(mapNewHashMapWithExpectedSize);
    }
}
