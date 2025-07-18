package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddg implements dcn {
    public static final ddg a = new ddg();

    private ddg() {
    }

    @Override // defpackage.dcn
    public final /* synthetic */ Object a() {
        return new ddf(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d A[Catch: all -> 0x0034, TRY_ENTER, TryCatch #3 {, blocks: (B:6:0x0015, B:8:0x0019, B:13:0x002d, B:14:0x002f, B:11:0x0021, B:15:0x0031), top: B:127:0x0015, outer: #6 }] */
    @Override // defpackage.dcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.io.InputStream r15) throws defpackage.der, defpackage.dav {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddg.b(java.io.InputStream):java.lang.Object");
    }

    @Override // defpackage.dcn
    public final /* bridge */ /* synthetic */ Object c(Object obj, OutputStream outputStream) throws IOException {
        ddb ddbVar;
        Map mapC = ((ddf) obj).c();
        dei deiVarI = dcz.DEFAULT_INSTANCE.i();
        for (Map.Entry entry : mapC.entrySet()) {
            dde ddeVar = (dde) entry.getKey();
            Object value = entry.getValue();
            String str = ddeVar.a;
            if (value instanceof Boolean) {
                dei deiVarB = ddb.b();
                Boolean bool = (Boolean) value;
                bool.booleanValue();
                deiVarB.f();
                ddb ddbVar2 = (ddb) deiVarB.b;
                ddbVar2.valueCase_ = 1;
                ddbVar2.value_ = bool;
                dek dekVarC = deiVarB.c();
                dekVarC.getClass();
                ddbVar = (ddb) dekVarC;
            } else if (value instanceof Float) {
                dei deiVarB2 = ddb.b();
                float fFloatValue = ((Number) value).floatValue();
                deiVarB2.f();
                ddb ddbVar3 = (ddb) deiVarB2.b;
                ddbVar3.valueCase_ = 2;
                ddbVar3.value_ = Float.valueOf(fFloatValue);
                dek dekVarC2 = deiVarB2.c();
                dekVarC2.getClass();
                ddbVar = (ddb) dekVarC2;
            } else if (value instanceof Double) {
                dei deiVarB3 = ddb.b();
                double dDoubleValue = ((Number) value).doubleValue();
                deiVarB3.f();
                ddb ddbVar4 = (ddb) deiVarB3.b;
                ddbVar4.valueCase_ = 7;
                ddbVar4.value_ = Double.valueOf(dDoubleValue);
                dek dekVarC3 = deiVarB3.c();
                dekVarC3.getClass();
                ddbVar = (ddb) dekVarC3;
            } else if (value instanceof Integer) {
                dei deiVarB4 = ddb.b();
                int iIntValue = ((Number) value).intValue();
                deiVarB4.f();
                ddb ddbVar5 = (ddb) deiVarB4.b;
                ddbVar5.valueCase_ = 3;
                ddbVar5.value_ = Integer.valueOf(iIntValue);
                dek dekVarC4 = deiVarB4.c();
                dekVarC4.getClass();
                ddbVar = (ddb) dekVarC4;
            } else if (value instanceof Long) {
                dei deiVarB5 = ddb.b();
                long jLongValue = ((Number) value).longValue();
                deiVarB5.f();
                ddb ddbVar6 = (ddb) deiVarB5.b;
                ddbVar6.valueCase_ = 4;
                ddbVar6.value_ = Long.valueOf(jLongValue);
                dek dekVarC5 = deiVarB5.c();
                dekVarC5.getClass();
                ddbVar = (ddb) dekVarC5;
            } else if (value instanceof String) {
                dei deiVarB6 = ddb.b();
                String str2 = (String) value;
                deiVarB6.f();
                ddb ddbVar7 = (ddb) deiVarB6.b;
                str2.getClass();
                ddbVar7.valueCase_ = 5;
                ddbVar7.value_ = str2;
                dek dekVarC6 = deiVarB6.c();
                dekVarC6.getClass();
                ddbVar = (ddb) dekVarC6;
            } else if (value instanceof Set) {
                dei deiVarB7 = ddb.b();
                dei deiVarI2 = dda.DEFAULT_INSTANCE.i();
                value.getClass();
                Set set = (Set) value;
                deiVarI2.f();
                dda ddaVar = (dda) deiVarI2.b;
                deo<String> deoVar = ddaVar.strings_;
                if (!deoVar.c()) {
                    int size = deoVar.size();
                    ddaVar.strings_ = deoVar.d(size == 0 ? 10 : size + size);
                }
                deo<String> deoVar2 = ddaVar.strings_;
                Charset charset = dep.a;
                if (set instanceof dev) {
                    List listA = ((dev) set).a();
                    dev devVar = (dev) deoVar2;
                    int size2 = deoVar2.size();
                    for (Object obj2 : listA) {
                        if (obj2 == null) {
                            String str3 = "Element at index " + (devVar.size() - size2) + " is null.";
                            int size3 = devVar.size();
                            while (true) {
                                size3--;
                                if (size3 < size2) {
                                    throw new NullPointerException(str3);
                                }
                                devVar.remove(size3);
                            }
                        } else if (obj2 instanceof dds) {
                            devVar.b();
                        } else if (obj2 instanceof byte[]) {
                            dds.i((byte[]) obj2);
                            devVar.b();
                        } else {
                            devVar.add((String) obj2);
                        }
                    }
                } else if (set instanceof dfo) {
                    deoVar2.addAll(set);
                } else {
                    a.I(set, deoVar2);
                }
                deiVarB7.f();
                ddb ddbVar8 = (ddb) deiVarB7.b;
                dda ddaVar2 = (dda) deiVarI2.c();
                ddaVar2.getClass();
                ddbVar8.value_ = ddaVar2;
                ddbVar8.valueCase_ = 6;
                dek dekVarC7 = deiVarB7.c();
                dekVarC7.getClass();
                ddbVar = (ddb) dekVarC7;
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(String.valueOf(value.getClass().getName())));
                }
                dei deiVarB8 = ddb.b();
                dds ddsVarI = dds.i((byte[]) value);
                deiVarB8.f();
                ddb ddbVar9 = (ddb) deiVarB8.b;
                ddbVar9.valueCase_ = 8;
                ddbVar9.value_ = ddsVarI;
                dek dekVarC8 = deiVarB8.c();
                dekVarC8.getClass();
                ddbVar = (ddb) dekVarC8;
            }
            deiVarI.f();
            dcz dczVar = (dcz) deiVarI.b;
            dfc<String, ddb> dfcVar = dczVar.preferences_;
            if (!dfcVar.b) {
                dczVar.preferences_ = dfcVar.a();
            }
            dczVar.preferences_.put(str, ddbVar);
        }
        dcz dczVar2 = (dcz) deiVarI.c();
        int iH = dczVar2.h();
        boolean z = ddz.e;
        if (iH > 4096) {
            iH = 4096;
        }
        ddw ddwVar = new ddw(outputStream, iH);
        dczVar2.r(ddwVar);
        if (ddwVar.c > 0) {
            ddwVar.i();
        }
        return ygi.a;
    }
}
