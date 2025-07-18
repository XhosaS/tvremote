package defpackage;

import android.net.Uri;
import android.support.v7.appcompat.R;
import j$.util.Map;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ovh extends yiz implements yjz {
    Object a;
    int b;
    final /* synthetic */ ovi c;
    final /* synthetic */ eph d;
    final /* synthetic */ UUID e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovh(ovi oviVar, eph ephVar, UUID uuid, yih yihVar) {
        super(2, yihVar);
        this.c = oviVar;
        this.d = ephVar;
        this.e = uuid;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ovh) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new ovh(this.c, this.d, this.e, yihVar);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) throws ouf, epv {
        Object objAA;
        Object obj2;
        Throwable ezvVar;
        int i;
        yio yioVar = yio.a;
        if (this.b != 0) {
            obj2 = this.a;
            ybn.f(obj);
            objAA = obj;
        } else {
            ybn.f(obj);
            ovi oviVar = this.c;
            eph ephVar = this.d;
            Map map = oviVar.c;
            yfw yfwVar = (yfw) Map.EL.getOrDefault(map, ephVar, null);
            if (yfwVar == null) {
                return new byte[0];
            }
            Object obj3 = yfwVar.b;
            byte[] bArr = (byte[]) yfwVar.a;
            oub oubVar = (oub) obj3;
            map.remove(ephVar);
            tui tuiVar = ovi.a;
            tug tugVar = (tug) tuiVar.b().j("com/google/android/libraries/googletv/player/kinetoscope/drm/NurMediaDrmCallback$executeKeyRequest$1", "invokeSuspend", 62, "NurMediaDrmCallback.kt");
            UUID uuid = this.e;
            Charset charset = ynd.a;
            tugVar.E("uuid: %s, session: %s, request: %s", uuid, new String(bArr, charset), qtl.aE(ephVar));
            if (oviVar.e && ephVar.a == 1) {
                ((tug) tuiVar.b().j("com/google/android/libraries/googletv/player/kinetoscope/drm/NurMediaDrmCallback$executeKeyRequest$1", "invokeSuspend", 70, "NurMediaDrmCallback.kt")).v("Skipping renewal request for session %s", new String(bArr, charset));
                return new byte[0];
            }
            ouy ouyVar = oviVar.g;
            String str = new String(bArr, charset);
            our ourVar = oviVar.b;
            int i2 = ephVar.a;
            Object obj4 = ephVar.b;
            int iAB = qtl.aB(i2);
            vsz vszVarQ = vsz.q((byte[]) obj4);
            String str2 = oviVar.d;
            this.a = bArr;
            this.b = 1;
            objAA = ouyVar.g.aA(new ouw(ouyVar, str, vszVarQ, iAB, oubVar, str2, ourVar, null), this);
            if (objAA == yioVar) {
                return yioVar;
            }
            obj2 = bArr;
        }
        ovi oviVar2 = this.c;
        eph ephVar2 = this.d;
        vzf vzfVar = (vzf) objAA;
        Boolean boolValueOf = vzfVar != null ? Boolean.valueOf(vzfVar.b == 3) : null;
        if (!yks.e(boolValueOf, true)) {
            if (!yks.e(boolValueOf, false)) {
                if (boolValueOf != null) {
                    throw new yfu();
                }
                ((tug) ovi.a.f().j("com/google/android/libraries/googletv/player/kinetoscope/drm/NurMediaDrmCallback$executeKeyRequest$1", "invokeSuspend", R.styleable.AppCompatTheme_windowMinWidthMajor, "NurMediaDrmCallback.kt")).B("Failed to get a license response for session %s, request %s.", new String((byte[]) obj2, ynd.a), qtl.aE(ephVar2));
                eex eexVar = new eex();
                eexVar.a = Uri.EMPTY;
                eexVar.a();
                Uri.parse((String) ephVar2.c);
                throw new epv(new ezv(new RuntimeException("Failed to get a license response.")));
            }
            ((tug) ovi.a.g().j("com/google/android/libraries/googletv/player/kinetoscope/drm/NurMediaDrmCallback$executeKeyRequest$1", "invokeSuspend", R.styleable.AppCompatTheme_textAppearanceListItemSmall, "NurMediaDrmCallback.kt")).B("No license available for session %s, request %s.", new String((byte[]) obj2, ynd.a), qtl.aE(ephVar2));
            eex eexVar2 = new eex();
            eexVar2.a = Uri.EMPTY;
            eexVar2.a();
            Uri.parse((String) ephVar2.c);
            if (vzfVar.b == 2) {
                vzb vzbVar = (vzb) vzfVar.c;
                vzbVar.getClass();
                ezvVar = new otv(vzbVar);
            } else {
                ezvVar = new ezv(new RuntimeException("Failed to get a license response."));
            }
            throw new epv(ezvVar);
        }
        for (vza vzaVar : (vzfVar.b == 3 ? (vze) vzfVar.c : vze.a).b) {
            byte[] bArrW = vzaVar.b.w();
            bArrW.getClass();
            String strF = osk.f(bArrW);
            vzaVar.getClass();
            byte[] bArrW2 = vzaVar.b.w();
            bArrW2.getClass();
            int iAK = a.aK(vzaVar.c);
            if (iAK == 0) {
                iAK = 1;
            }
            if (yks.e(vzaVar.d, "HDR")) {
                i = 3;
            } else {
                int iAK2 = a.aK(vzaVar.c);
                if (iAK2 == 0) {
                    iAK2 = 1;
                }
                int i3 = iAK2 - 2;
                i = (i3 == -1 || i3 == 0 || i3 == 1) ? 1 : 2;
            }
            otx otxVar = new otx(bArrW2, iAK, i, otw.d);
            java.util.Map map2 = oviVar2.f;
            Object linkedHashMap = map2.get(obj2);
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                map2.put(obj2, linkedHashMap);
            }
            ((java.util.Map) linkedHashMap).put(strF, otxVar);
            ((tug) ovi.a.b().j("com/google/android/libraries/googletv/player/kinetoscope/drm/NurMediaDrmCallback$executeKeyRequest$1", "invokeSuspend", 91, "NurMediaDrmCallback.kt")).G("Session %s received license key id hex: %s, status: %s, format: %s, range: %s", new String((byte[]) obj2, ynd.a), strF, otxVar.a.name(), vxr.e(otxVar.b), qtl.aD(otxVar.c));
        }
        byte[] bArrW3 = (vzfVar.b == 3 ? (vze) vzfVar.c : vze.a).c.w();
        bArrW3.getClass();
        return bArrW3;
    }
}
