package defpackage;

import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lbb extends lht implements ktw {
    public final Map a;
    final Map b;
    final Map c;
    final Map d;
    public final Map e;
    public final Map f;
    final wt g;
    public final Map h;
    public final Map i;
    final laz j;
    private final Map k;

    public lbb(lih lihVar) {
        super(lihVar);
        this.a = new we();
        this.b = new we();
        this.c = new we();
        this.d = new we();
        this.e = new we();
        this.k = new we();
        this.h = new we();
        this.i = new we();
        this.f = new we();
        this.g = new lay(this);
        this.j = new laz(this);
    }

    private final Map v(ljy ljyVar) {
        we weVar = new we();
        if (ljyVar != null) {
            for (lka lkaVar : ljyVar.e) {
                weVar.put(lkaVar.b, lkaVar.c);
            }
        }
        return weVar;
    }

    private final void w(String str, ljx ljxVar) {
        HashSet hashSet = new HashSet();
        we weVar = new we();
        we weVar2 = new we();
        we weVar3 = new we();
        Iterator it = DesugarCollections.unmodifiableList(((ljy) ljxVar.b).i).iterator();
        while (it.hasNext()) {
            hashSet.add(((lju) it.next()).b);
        }
        for (int i = 0; i < ((ljy) ljxVar.b).f.size(); i++) {
            ljw ljwVar = (ljw) ((ljy) ljxVar.b).f.get(i);
            ljv ljvVar = new ljv();
            ljvVar.B(ljwVar);
            if (((ljw) ljvVar.b).c.isEmpty()) {
                lbk lbkVar = this.y;
                lab labVar = lbkVar.f;
                lbkVar.o(labVar);
                labVar.f.a("EventConfig contained null event name");
            } else {
                String str2 = ((ljw) ljvVar.b).c;
                String strB = lcu.b(str2);
                if (!TextUtils.isEmpty(strB)) {
                    if ((ljvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ljvVar.y();
                    }
                    ljw ljwVar2 = (ljw) ljvVar.b;
                    strB.getClass();
                    ljwVar2.b |= 1;
                    ljwVar2.c = strB;
                    if ((ljxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ljxVar.y();
                    }
                    ljy ljyVar = (ljy) ljxVar.b;
                    ljw ljwVar3 = (ljw) ljvVar.v();
                    ljwVar3.getClass();
                    abxs abxsVar = ljyVar.f;
                    if (!abxsVar.c()) {
                        int size = abxsVar.size();
                        ljyVar.f = abxsVar.d(size + size);
                    }
                    ljyVar.f.set(i, ljwVar3);
                }
                ljw ljwVar4 = (ljw) ljvVar.b;
                if ((ljwVar4.b & 2) != 0 && ljwVar4.d) {
                    weVar.put(str2, true);
                }
                ljw ljwVar5 = (ljw) ljvVar.b;
                if ((ljwVar5.b & 4) != 0 && ljwVar5.e) {
                    weVar2.put(ljwVar5.c, true);
                }
                ljw ljwVar6 = (ljw) ljvVar.b;
                if ((ljwVar6.b & 8) != 0) {
                    int i2 = ljwVar6.f;
                    if (i2 < 2 || i2 > 65535) {
                        lbk lbkVar2 = this.y;
                        lab labVar2 = lbkVar2.f;
                        lbkVar2.o(labVar2);
                        kzz kzzVar = labVar2.f;
                        ljw ljwVar7 = (ljw) ljvVar.b;
                        kzzVar.c("Invalid sampling rate. Event name, sample rate", ljwVar7.c, Integer.valueOf(ljwVar7.f));
                    } else {
                        weVar3.put(ljwVar6.c, Integer.valueOf(i2));
                    }
                }
            }
        }
        this.b.put(str, hashSet);
        this.c.put(str, weVar);
        this.d.put(str, weVar2);
        this.f.put(str, weVar3);
    }

    @Override // defpackage.ktw
    public final String a(String str, String str2) {
        g();
        i(str);
        Map map = (Map) this.a.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    final lcq c(String str, lcs lcsVar) {
        g();
        i(str);
        ljs ljsVarD = d(str);
        if (ljsVarD == null) {
            return lcq.UNINITIALIZED;
        }
        for (ljh ljhVar : ljsVarD.g) {
            int iA = ljn.a(ljhVar.b);
            if (iA == 0) {
                iA = 1;
            }
            if (s(iA) == lcsVar) {
                int iA2 = ljl.a(ljhVar.c);
                if (iA2 == 0) {
                    iA2 = 1;
                }
                int i = iA2 - 1;
                return i != 1 ? i != 2 ? lcq.UNINITIALIZED : lcq.DENIED : lcq.GRANTED;
            }
        }
        return lcq.UNINITIALIZED;
    }

    final ljs d(String str) {
        g();
        i(str);
        ljy ljyVarE = e(str);
        if (ljyVarE == null || (ljyVarE.b & 128) == 0) {
            return null;
        }
        ljs ljsVar = ljyVarE.k;
        return ljsVar == null ? ljs.a : ljsVar;
    }

    protected final ljy e(String str) {
        ag();
        g();
        kkk.h(str);
        i(str);
        return (ljy) this.e.get(str);
    }

    public final ljy f(String str, byte[] bArr) {
        if (bArr == null) {
            return ljy.a;
        }
        try {
            ljy ljyVar = ljy.a;
            ljy ljyVar2 = (ljy) ((ljx) lik.o(new ljx(), bArr)).v();
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.k.c("Parsed config. version, gmp_app_id", (ljyVar2.b & 1) != 0 ? Long.valueOf(ljyVar2.c) : null, (ljyVar2.b & 2) != 0 ? ljyVar2.d : null);
            return ljyVar2;
        } catch (abxv e) {
            lbk lbkVar2 = this.y;
            lab labVar2 = lbkVar2.f;
            lbkVar2.o(labVar2);
            labVar2.f.c("Unable to merge remote config. appId", lab.b(str), e);
            return ljy.a;
        } catch (RuntimeException e2) {
            lbk lbkVar3 = this.y;
            lab labVar3 = lbkVar3.f;
            lbkVar3.o(labVar3);
            labVar3.f.c("Unable to merge remote config. appId", lab.b(str), e2);
            return ljy.a;
        }
    }

    final String h(String str) {
        g();
        i(str);
        return (String) this.k.get(str);
    }

    public final void i(String str) {
        ag();
        g();
        kkk.h(str);
        Map map = this.e;
        if (map.get(str) == null) {
            kub kubVarJ = ad().j(str);
            if (kubVarJ == null) {
                this.a.put(str, null);
                this.c.put(str, null);
                this.b.put(str, null);
                this.d.put(str, null);
                map.put(str, null);
                this.k.put(str, null);
                this.h.put(str, null);
                this.i.put(str, null);
                this.f.put(str, null);
                return;
            }
            ljy ljyVarF = f(str, kubVarJ.a);
            ljx ljxVar = new ljx();
            ljxVar.B(ljyVarF);
            w(str, ljxVar);
            this.a.put(str, v((ljy) ljxVar.v()));
            map.put(str, (ljy) ljxVar.v());
            j(str, (ljy) ljxVar.v());
            this.k.put(str, ((ljy) ljxVar.b).j);
            this.h.put(str, kubVarJ.b);
            this.i.put(str, kubVarJ.c);
        }
    }

    public final void j(final String str, ljy ljyVar) throws epm {
        eqp eqpVar;
        if (ljyVar.h.size() == 0) {
            this.g.g(str);
            return;
        }
        lbk lbkVar = this.y;
        lab labVar = lbkVar.f;
        lbkVar.o(labVar);
        kzz kzzVar = labVar.k;
        kzzVar.b("EES programs found", Integer.valueOf(ljyVar.h.size()));
        lma lmaVar = (lma) ljyVar.h.get(0);
        try {
            epl eplVar = new epl();
            Callable callable = new Callable() { // from class: lau
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new epw(new lba(this.a, str));
                }
            };
            epo epoVar = eplVar.a;
            eps epsVar = epoVar.d;
            epsVar.a("internal.remoteConfig", callable);
            epsVar.a("internal.appMetadata", new Callable() { // from class: lav
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final lbb lbbVar = this.a;
                    final String str2 = str;
                    return new eqb(new Callable() { // from class: lax
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            lbb lbbVar2 = lbbVar;
                            kug kugVarAd = lbbVar2.ad();
                            String str3 = str2;
                            ksx ksxVarH = kugVarAd.h(str3);
                            HashMap map = new HashMap();
                            map.put("platform", "android");
                            map.put("package_name", str3);
                            kts ktsVar = lbbVar2.y.d.y.c;
                            map.put("gmp_version", 129017L);
                            if (ksxVarH != null) {
                                String strW = ksxVarH.w();
                                if (strW != null) {
                                    map.put("app_version", strW);
                                }
                                map.put("app_version_int", Long.valueOf(ksxVarH.c()));
                                map.put("dynamite_version", Long.valueOf(ksxVarH.g()));
                            }
                            return map;
                        }
                    });
                }
            });
            epsVar.a("internal.logger", new Callable() { // from class: law
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new eqa(this.a.j);
                }
            });
            try {
                eplVar.b = epoVar.b.a();
                if (epoVar.a(eplVar.b, (lme[]) lmaVar.b.toArray(new lme[0])) instanceof eqn) {
                    throw new IllegalStateException("Program loading failed");
                }
                llw llwVar = lmaVar.c;
                if (llwVar == null) {
                    llwVar = llw.a;
                }
                for (lly llyVar : llwVar.b) {
                    abxs abxsVar = llyVar.c;
                    String str2 = llyVar.b;
                    Iterator it = abxsVar.iterator();
                    while (it.hasNext()) {
                        eqw eqwVarA = epoVar.a(eplVar.b, (lme) it.next());
                        if (!(eqwVarA instanceof eqt)) {
                            throw new IllegalArgumentException("Invalid rule definition");
                        }
                        epp eppVar = eplVar.b;
                        if (eppVar.g(str2)) {
                            eqw eqwVarC = eppVar.c(str2);
                            if (!(eqwVarC instanceof eqp)) {
                                throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(str2)));
                            }
                            eqpVar = (eqp) eqwVarC;
                        } else {
                            eqpVar = null;
                        }
                        if (eqpVar == null) {
                            throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(str2)));
                        }
                        eqpVar.a(eplVar.b, Collections.singletonList(eqwVarA));
                    }
                }
                this.g.f(str, eplVar);
                lbkVar.o(labVar);
                llw llwVar2 = lmaVar.c;
                if (llwVar2 == null) {
                    llwVar2 = llw.a;
                }
                kzzVar.c("EES program loaded for appId, activities", str, Integer.valueOf(llwVar2.b.size()));
                llw llwVar3 = lmaVar.c;
                if (llwVar3 == null) {
                    llwVar3 = llw.a;
                }
                for (lly llyVar2 : llwVar3.b) {
                    lbkVar.o(labVar);
                    kzzVar.b("EES program activity", llyVar2.b);
                }
            } catch (Throwable th) {
                throw new epm(th);
            }
        } catch (epm unused) {
            lbk lbkVar2 = this.y;
            lab labVar2 = lbkVar2.f;
            lbkVar2.o(labVar2);
            labVar2.c.b("Failed to load EES program. appId", str);
        }
    }

    final boolean k(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_internal"));
    }

    final boolean l(String str, lcs lcsVar) {
        g();
        i(str);
        ljs ljsVarD = d(str);
        if (ljsVarD == null) {
            return false;
        }
        Iterator it = ljsVarD.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ljh ljhVar = (ljh) it.next();
            int iA = ljn.a(ljhVar.b);
            if (iA == 0) {
                iA = 1;
            }
            if (lcsVar == s(iA)) {
                int iA2 = ljl.a(ljhVar.c);
                if (iA2 != 0 && iA2 == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    final boolean m(String str) {
        g();
        i(str);
        ljs ljsVarD = d(str);
        return ljsVarD == null || (ljsVarD.b & 1) == 0 || ljsVarD.f;
    }

    final boolean n(String str, String str2) {
        Boolean bool;
        g();
        i(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.d.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final boolean o(String str, String str2) {
        Boolean bool;
        g();
        i(str);
        if (k(str) && lio.am(str2)) {
            return true;
        }
        if (p(str) && lio.an(str2)) {
            return true;
        }
        Map map = (Map) this.c.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final boolean p(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_public"));
    }

    final boolean q(String str) {
        g();
        i(str);
        Map map = this.b;
        return map.get(str) != null && ((Set) map.get(str)).contains("app_instance_id");
    }

    final boolean r(String str) {
        g();
        i(str);
        Map map = this.b;
        if (map.get(str) != null) {
            return ((Set) map.get(str)).contains("os_version") || ((Set) map.get(str)).contains("device_info");
        }
        return false;
    }

    public final lcs s(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return lcs.AD_STORAGE;
        }
        if (i2 == 2) {
            return lcs.ANALYTICS_STORAGE;
        }
        if (i2 == 3) {
            return lcs.AD_USER_DATA;
        }
        if (i2 != 4) {
            return null;
        }
        return lcs.AD_PERSONALIZATION;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0395, code lost:
    
        throw new java.lang.IllegalStateException(defpackage.a.b(r12, "serialized size must be non-negative, was "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0396, code lost:
    
        r28 = r13;
        r12 = r12 & Integer.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x039c, code lost:
    
        if (r12 != Integer.MAX_VALUE) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x039e, code lost:
    
        r12 = defpackage.abza.a.a(r14.getClass()).a(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x03ac, code lost:
    
        if (r12 < 0) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x03ae, code lost:
    
        r14.memoizedSerializedSize = (r14.memoizedSerializedSize & Integer.MIN_VALUE) | r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x03bf, code lost:
    
        throw new java.lang.IllegalStateException(defpackage.a.b(r12, "serialized size must be non-negative, was "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x03c0, code lost:
    
        r13 = new byte[r12];
        r29 = defpackage.abvz.e;
        r29 = r5;
        r30 = r7;
        r5 = new defpackage.abvw(r13, 0, r12);
        defpackage.abza.a.a(r14.getClass()).m(r14, defpackage.abwa.a(r5));
        r5.K();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x03e2, code lost:
    
        r5 = new android.content.ContentValues();
        r5.put("app_id", r32);
        r5.put("audience_id", java.lang.Integer.valueOf(r27));
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x03f5, code lost:
    
        if ((r14.b & 1) == 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x03f7, code lost:
    
        r3 = java.lang.Integer.valueOf(r14.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x03fe, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x03ff, code lost:
    
        r5.put("filter_id", r3);
        r5.put("event_name", r14.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x040d, code lost:
    
        if ((r14.b & 64) == 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x040f, code lost:
    
        r1 = java.lang.Boolean.valueOf(r14.i);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0416, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0417, code lost:
    
        r5.put("session_scoped", r1);
        r5.put("data", r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0429, code lost:
    
        if (r8.e().insertWithOnConflict("event_filters", null, r5, 5) != (-1)) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x042b, code lost:
    
        r1 = r8.y;
        r3 = r1.f;
        r1.o(r3);
        r3.c.b("Failed to insert event filter (got -1). appId", defpackage.lab.b(r32));
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x043d, code lost:
    
        r1 = r24;
        r3 = r25;
        r10 = r26;
        r12 = r27;
        r13 = r28;
        r5 = r29;
        r7 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x044d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x044e, code lost:
    
        r1 = r8.y;
        r3 = r1.f;
        r1.o(r3);
        r3.c.c("Error storing event filter. appId", defpackage.lab.b(r32), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0461, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x046b, code lost:
    
        throw new java.lang.RuntimeException(defpackage.a.y(" to a byte array threw an IOException (should never happen).", r14), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x046c, code lost:
    
        r29 = r5;
        r30 = r7;
        r27 = r12;
        r0 = r0.d.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x047c, code lost:
    
        if (r0.hasNext() == false) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x047e, code lost:
    
        r5 = (defpackage.lja) r0.next();
        r8.ag();
        r8.g();
        defpackage.kkk.h(r32);
        defpackage.kkk.k(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0496, code lost:
    
        if (r5.d.isEmpty() == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0498, code lost:
    
        r0 = r8.y;
        r1 = r0.f;
        r0.o(r1);
        r0 = r1.f;
        r1 = defpackage.lab.b(r32);
        r3 = java.lang.Integer.valueOf(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x04ad, code lost:
    
        if ((r5.b & 1) == 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x04af, code lost:
    
        r11 = java.lang.Integer.valueOf(r5.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x04b6, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x04b7, code lost:
    
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r1, r3, java.lang.String.valueOf(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x04c0, code lost:
    
        r13 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x04c4, code lost:
    
        r7 = r5.memoizedSerializedSize;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x04c8, code lost:
    
        if ((r7 & Integer.MIN_VALUE) == 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x04ca, code lost:
    
        r7 = defpackage.abza.a.a(r5.getClass()).a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x04d8, code lost:
    
        if (r7 < 0) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x04e4, code lost:
    
        throw new java.lang.IllegalStateException(defpackage.a.b(r7, "serialized size must be non-negative, was "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x04e5, code lost:
    
        r7 = r7 & Integer.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x04e9, code lost:
    
        if (r7 != Integer.MAX_VALUE) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x04eb, code lost:
    
        r7 = defpackage.abza.a.a(r5.getClass()).a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x04f9, code lost:
    
        if (r7 < 0) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x04fb, code lost:
    
        r5.memoizedSerializedSize = (r5.memoizedSerializedSize & Integer.MIN_VALUE) | r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x050c, code lost:
    
        throw new java.lang.IllegalStateException(defpackage.a.b(r7, "serialized size must be non-negative, was "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x050d, code lost:
    
        r12 = new byte[r7];
        r13 = defpackage.abvz.e;
        r13 = new defpackage.abvw(r12, 0, r7);
        defpackage.abza.a.a(r5.getClass()).m(r5, defpackage.abwa.a(r13));
        r13.K();
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x052b, code lost:
    
        r7 = new android.content.ContentValues();
        r7.put("app_id", r32);
        r7.put("audience_id", java.lang.Integer.valueOf(r27));
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x053e, code lost:
    
        if ((r5.b & 1) == 0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0540, code lost:
    
        r13 = java.lang.Integer.valueOf(r5.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0547, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0548, code lost:
    
        r7.put("filter_id", r13);
        r7.put("property_name", r5.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0556, code lost:
    
        if ((r5.b & 32) == 0) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0558, code lost:
    
        r5 = java.lang.Boolean.valueOf(r5.h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x055f, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0560, code lost:
    
        r7.put("session_scoped", r5);
        r7.put("data", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x056a, code lost:
    
        r13 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0574, code lost:
    
        if (r8.e().insertWithOnConflict(r13, null, r7, 5) != (-1)) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0576, code lost:
    
        r0 = r8.y;
        r1 = r0.f;
        r0.o(r1);
        r1.c.b("Failed to insert property filter (got -1). appId", defpackage.lab.b(r32));
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0589, code lost:
    
        r30 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x058d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x058f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0590, code lost:
    
        r13 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0592, code lost:
    
        r1 = r8.y;
        r3 = r1.f;
        r1.o(r3);
        r3.c.c("Error storing property filter. appId", defpackage.lab.b(r32), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x05a4, code lost:
    
        r8.ag();
        r8.g();
        defpackage.kkk.h(r32);
        r0 = r8.e();
        r3 = r29;
        r0.delete(r13, r3, new java.lang.String[]{r32, java.lang.String.valueOf(r27)});
        r0.delete("event_filters", r3, new java.lang.String[]{r32, java.lang.String.valueOf(r27)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x05ca, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x05d4, code lost:
    
        throw new java.lang.RuntimeException(defpackage.a.y(" to a byte array threw an IOException (should never happen).", r5), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x05d5, code lost:
    
        r1 = r24;
        r3 = r25;
        r10 = r26;
        r5 = r29;
        r7 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0800, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02d8, code lost:
    
        r13 = r0.d.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02e2, code lost:
    
        if (r13.hasNext() == false) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02ee, code lost:
    
        if ((((defpackage.lja) r13.next()).b & 1) != 0) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02f0, code lost:
    
        r0 = r8.y;
        r4 = r0.f;
        r0.o(r4);
        r4.f.c("Property filter with no ID. Audience definition ignored. appId, audienceId", defpackage.lab.b(r32), java.lang.Integer.valueOf(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0307, code lost:
    
        r13 = r0.e.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0313, code lost:
    
        r24 = r1;
        r25 = r3;
        r26 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0328, code lost:
    
        if (r13.hasNext() == false) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x032a, code lost:
    
        r14 = (defpackage.lis) r13.next();
        r8.ag();
        r8.g();
        defpackage.kkk.h(r32);
        defpackage.kkk.k(r14);
        r27 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0344, code lost:
    
        if (r14.d.isEmpty() == false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0346, code lost:
    
        r0 = r8.y;
        r1 = r0.f;
        r0.o(r1);
        r0 = r1.f;
        r1 = defpackage.lab.b(r32);
        r3 = java.lang.Integer.valueOf(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x035b, code lost:
    
        if ((r14.b & 1) == 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x035d, code lost:
    
        r11 = java.lang.Integer.valueOf(r14.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0364, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0365, code lost:
    
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r1, r3, java.lang.String.valueOf(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x036e, code lost:
    
        r29 = r5;
        r13 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0373, code lost:
    
        r12 = r14.memoizedSerializedSize;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0377, code lost:
    
        if ((r12 & Integer.MIN_VALUE) == 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0379, code lost:
    
        r28 = r13;
        r12 = defpackage.abza.a.a(r14.getClass()).a(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0389, code lost:
    
        if (r12 < 0) goto L288;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void t(java.lang.String r32, byte[] r33, java.lang.String r34, java.lang.String r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2061
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lbb.t(java.lang.String, byte[], java.lang.String, java.lang.String):void");
    }

    @Override // defpackage.lht
    protected final void b() {
    }
}
