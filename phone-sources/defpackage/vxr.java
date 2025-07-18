package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.StatsEvent;
import android.util.StatsLog;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.chromium.net.CronetException;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.UploadDataProvider;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vxr {
    public static aafi a;
    private static volatile xsq b;

    public vxr() {
    }

    public static final /* synthetic */ wpd A(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (wpd) vucVarO;
    }

    public static final void B(vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wpd wpdVar = (wpd) vtwVar.b;
        wpd wpdVar2 = wpd.a;
        wpdVar.f = "play-movies";
    }

    public static final /* synthetic */ woz C(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (woz) vucVarO;
    }

    public static final /* synthetic */ wow E(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (wow) vucVarO;
    }

    public static final void F(int i, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wow wowVar = (wow) vtwVar.b;
        wow wowVar2 = wow.a;
        wowVar.b = a.aJ(i);
    }

    public static final /* synthetic */ woq G(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (woq) vucVarO;
    }

    public static final /* synthetic */ wop I(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (wop) vucVarO;
    }

    public static final void J(wkx wkxVar, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wop wopVar = (wop) vtwVar.b;
        wop wopVar2 = wop.a;
        wopVar.e = wkxVar;
        wopVar.b |= 1;
    }

    public static final void K(String str, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wop wopVar = (wop) vtwVar.b;
        wop wopVar2 = wop.a;
        wopVar.d = str;
    }

    public static final void L(String str, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wop wopVar = (wop) vtwVar.b;
        wop wopVar2 = wop.a;
        wopVar.c = str;
    }

    public static final /* synthetic */ wnz M(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (wnz) vucVarO;
    }

    public static final void N(wnw wnwVar, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wnz wnzVar = (wnz) vtwVar.b;
        wnz wnzVar2 = wnz.a;
        wnzVar.c = wnwVar;
        wnzVar.b = 1;
    }

    public static final /* synthetic */ upo O(vtw vtwVar) {
        vtwVar.getClass();
        return new upo(vtwVar, (byte[]) null);
    }

    public static final void P(vsz vszVar, ArrayDeque arrayDeque) {
        if (!vszVar.h()) {
            if (!(vszVar instanceof vvx)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(String.valueOf(vszVar.getClass()))));
            }
            vvx vvxVar = (vvx) vszVar;
            int[] iArr = vvx.a;
            P(vvxVar.e, arrayDeque);
            P(vvxVar.f, arrayDeque);
            return;
        }
        int iBM = bM(vszVar.d());
        int iC = vvx.c(iBM + 1);
        if (arrayDeque.isEmpty() || ((vsz) arrayDeque.peek()).d() >= iC) {
            arrayDeque.push(vszVar);
            return;
        }
        int iC2 = vvx.c(iBM);
        vsz vvxVar2 = (vsz) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((vsz) arrayDeque.peek()).d() < iC2) {
            vvxVar2 = new vvx((vsz) arrayDeque.pop(), vvxVar2);
        }
        vvx vvxVar3 = new vvx(vvxVar2, vszVar);
        while (!arrayDeque.isEmpty()) {
            if (((vsz) arrayDeque.peek()).d() >= vvx.c(bM(vvxVar3.d) + 1)) {
                break;
            } else {
                vvxVar3 = new vvx((vsz) arrayDeque.pop(), vvxVar3);
            }
        }
        arrayDeque.push(vvxVar3);
    }

    public static final vvd Q(Object obj) {
        return (vvd) ((upo) obj).a;
    }

    public static final boolean R(Object obj) {
        return !((vve) obj).b;
    }

    public static final Object S(Object obj, Object obj2) {
        vve vveVarA = (vve) obj;
        vve vveVar = (vve) obj2;
        if (!vveVar.isEmpty()) {
            if (!vveVarA.b) {
                vveVarA = vveVarA.a();
            }
            vveVarA.b();
            if (!vveVar.isEmpty()) {
                vveVarA.putAll(vveVar);
            }
        }
        return vveVarA;
    }

    public static final Object T() {
        return vve.a.a();
    }

    public static vun U(Object obj, long j) {
        return (vun) vwl.h(obj, j);
    }

    public static final List V(Object obj, long j) {
        vun vunVarU = U(obj, j);
        if (vunVarU.c()) {
            return vunVarU;
        }
        int size = vunVarU.size();
        vun vunVarD = vunVarU.d(size == 0 ? 10 : size + size);
        vwl.u(obj, j, vunVarD);
        return vunVarD;
    }

    public static vtr W(Object obj) {
        return ((vtz) obj).l;
    }

    public static vtr X(Object obj) {
        return ((vtz) obj).c();
    }

    public static void Y(vtf vtfVar, Object obj, vtp vtpVar, vtr vtrVar) {
        vvd vvdVar = (vvd) obj;
        vtrVar.l((vub) vvdVar.c, vtfVar.t(vvdVar.a.getClass(), vtpVar));
    }

    public static final void Z(Object obj) {
        W(obj).e();
    }

    public static xsq a() {
        xsq xsqVarA;
        xsq xsqVar = b;
        if (xsqVar != null) {
            return xsqVar;
        }
        synchronized (vxr.class) {
            xsqVarA = b;
            if (xsqVarA == null) {
                xsn xsnVarA = xsq.a();
                xsnVarA.d = xsp.UNARY;
                xsnVarA.e = xsq.c("google.internal.play.movies.dfe.v1beta.config.ConfigService", "Fetch");
                xsnVarA.b();
                vxs vxsVar = vxs.a;
                vtp vtpVar = yer.a;
                xsnVarA.b = new yep(vxsVar);
                xsnVarA.c = new yep(vxx.a);
                xsqVarA = xsnVarA.a();
                b = xsqVarA;
            }
        }
        return xsqVarA;
    }

    public static boolean aA(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static void aB(long j, String str) {
        if (j < 0) {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean aC(double d, int i, int i2) {
        return d >= ((double) i) && d < ((double) i2);
    }

    public static int aD(Boolean bool) {
        if (bool == null) {
            return 1;
        }
        return bool.booleanValue() ? 2 : 3;
    }

    public static void aE(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        StatsEvent.Builder builderNewBuilder = StatsEvent.newBuilder();
        builderNewBuilder.setAtomId(762);
        builderNewBuilder.writeLong(j);
        builderNewBuilder.writeInt(i);
        builderNewBuilder.writeInt(i2);
        builderNewBuilder.writeInt(i3);
        builderNewBuilder.writeInt(i4);
        builderNewBuilder.writeInt(i5);
        builderNewBuilder.writeInt(i6);
        builderNewBuilder.writeInt(i7);
        builderNewBuilder.writeInt(i8);
        builderNewBuilder.writeInt(i9);
        builderNewBuilder.writeInt(i10);
        builderNewBuilder.writeInt(i11);
        builderNewBuilder.writeInt(i12);
        builderNewBuilder.writeInt(i13);
        builderNewBuilder.addBooleanAnnotation((byte) 1, true);
        builderNewBuilder.usePooledBuffer();
        StatsLog.write(builderNewBuilder.build());
    }

    public static void aF(long j, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, int i6, boolean z3, boolean z4, boolean z5, String str, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, long j2, int i28) {
        StatsEvent.Builder builderNewBuilder = StatsEvent.newBuilder();
        builderNewBuilder.setAtomId(703);
        builderNewBuilder.writeLong(j);
        builderNewBuilder.writeInt(i);
        builderNewBuilder.writeInt(i2);
        builderNewBuilder.writeInt(i3);
        builderNewBuilder.writeInt(i4);
        builderNewBuilder.writeInt(i5);
        builderNewBuilder.writeBoolean(z);
        builderNewBuilder.writeBoolean(z2);
        builderNewBuilder.writeInt(i6);
        builderNewBuilder.writeBoolean(z3);
        builderNewBuilder.writeBoolean(z4);
        builderNewBuilder.writeBoolean(z5);
        builderNewBuilder.writeInt(0);
        builderNewBuilder.writeString(str);
        builderNewBuilder.writeInt(i7);
        builderNewBuilder.writeInt(i8);
        builderNewBuilder.writeInt(i9);
        builderNewBuilder.writeInt(i10);
        builderNewBuilder.writeInt(i11);
        builderNewBuilder.writeInt(i12);
        builderNewBuilder.writeInt(i13);
        builderNewBuilder.writeInt(i14);
        builderNewBuilder.writeInt(i15);
        builderNewBuilder.writeInt(i16);
        builderNewBuilder.writeInt(i17);
        builderNewBuilder.writeInt(i18);
        builderNewBuilder.writeInt(i19);
        builderNewBuilder.writeInt(i20);
        builderNewBuilder.writeInt(i21);
        builderNewBuilder.writeInt(i22);
        builderNewBuilder.writeInt(i23);
        builderNewBuilder.writeInt(i24);
        builderNewBuilder.writeInt(i25);
        builderNewBuilder.writeInt(i26);
        builderNewBuilder.writeInt(i27);
        builderNewBuilder.writeLong(j2);
        builderNewBuilder.writeInt(i28);
        builderNewBuilder.addBooleanAnnotation((byte) 1, true);
        builderNewBuilder.usePooledBuffer();
        StatsLog.write(builderNewBuilder.build());
    }

    public static void aG(long j, int i, int i2, int i3, int i4, int i5, long j2, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        StatsEvent.Builder builderNewBuilder = StatsEvent.newBuilder();
        builderNewBuilder.setAtomId(704);
        builderNewBuilder.writeLong(j);
        builderNewBuilder.writeInt(i);
        builderNewBuilder.writeInt(i2);
        builderNewBuilder.writeInt(i3);
        builderNewBuilder.writeInt(i4);
        builderNewBuilder.writeInt(i5);
        builderNewBuilder.writeLong(j2);
        builderNewBuilder.writeInt(i6);
        builderNewBuilder.writeInt(i7);
        builderNewBuilder.writeBoolean(false);
        builderNewBuilder.writeBoolean(false);
        builderNewBuilder.writeInt(i8);
        builderNewBuilder.writeInt(i9);
        builderNewBuilder.writeInt(i10);
        builderNewBuilder.writeLong(-1L);
        builderNewBuilder.writeLong(-1L);
        builderNewBuilder.writeInt(i11);
        builderNewBuilder.writeInt(i12);
        builderNewBuilder.writeInt(i13);
        builderNewBuilder.writeInt(i14);
        builderNewBuilder.writeInt(i15);
        builderNewBuilder.addBooleanAnnotation((byte) 1, true);
        builderNewBuilder.writeInt(0);
        builderNewBuilder.writeInt(0);
        builderNewBuilder.writeInt(0);
        builderNewBuilder.writeInt(0);
        builderNewBuilder.writeInt(i16);
        builderNewBuilder.writeString("138.0.7156.0");
        builderNewBuilder.writeInt(i17);
        builderNewBuilder.usePooledBuffer();
        StatsLog.write(builderNewBuilder.build());
    }

    public static void aH(ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
        }
    }

    public static String aI(int i) {
        switch (i) {
            case 0:
                return "NOT_STARTED";
            case 1:
                return "STARTED";
            case 2:
                return "REDIRECT_RECEIVED";
            case 3:
                return "AWAITING_FOLLOW_REDIRECT";
            case 4:
                return "AWAITING_READ";
            case 5:
                return "READING";
            case 6:
                return "ERROR";
            case 7:
                return "COMPLETE";
            case 8:
                return "CANCELLED";
            default:
                throw new IllegalArgumentException(a.cf(i, "Unknown state "));
        }
    }

    public static Object aJ(zzs zzsVar, Class cls) throws Exception {
        try {
            return zzsVar.a();
        } catch (Exception e) {
            if (nol$$ExternalSyntheticApiModelOutline8.m$4(e)) {
                InlineExecutionProhibitedException inlineExecutionProhibitedException = new InlineExecutionProhibitedException();
                inlineExecutionProhibitedException.initCause(e);
                throw inlineExecutionProhibitedException;
            }
            if (nol$$ExternalSyntheticApiModelOutline8.m472m((Object) e)) {
                throw aK(e);
            }
            if (cls.isInstance(e)) {
                throw e;
            }
            throw e;
        }
    }

    public static CronetException aK(Exception exc) {
        if (nol$$ExternalSyntheticApiModelOutline8.m472m((Object) exc)) {
            return nol$$ExternalSyntheticApiModelOutline8.m$1(exc) ? new zzc(nol$$ExternalSyntheticApiModelOutline8.m458m((Object) exc)) : nol$$ExternalSyntheticApiModelOutline8.m$2(exc) ? new zzb(nol$$ExternalSyntheticApiModelOutline8.m457m((Object) exc), false) : nol$$ExternalSyntheticApiModelOutline8.m$3(exc) ? new zyw(nol$$ExternalSyntheticApiModelOutline8.m((Object) exc)) : new zza(nol$$ExternalSyntheticApiModelOutline8.m456m((Object) exc));
        }
        throw new IllegalArgumentException("Not an Android Cronet exception", exc);
    }

    public static /* synthetic */ String aL(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "BYTES" : "STRING" : "FLOAT" : "INT" : "BOOL";
    }

    public static UploadDataProvider aM(byte[] bArr, int i, int i2) {
        return new zyk(ByteBuffer.wrap(bArr, i, i2).slice());
    }

    public static JSONObject aN(JSONObject jSONObject, String str) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalArgumentException(a.cg(str, "Failed adding a default object for key [", "]"), e);
        }
    }

    public static byte[] aO(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT];
        while (true) {
            int i = inputStream.read(bArr, 0, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
            if (i < 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public static int aP(InputStream inputStream, byte[] bArr, int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                break;
            }
            i2 += i3;
        }
        return i2;
    }

    public static int aQ(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i + 1] & 255) << 16) | (bArr[i] << 24) | ((bArr[i + 2] & 255) << 8);
    }

    public static int aR(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16);
    }

    public static long aS(byte[] bArr, int i) {
        int i2 = i + 4;
        return (aR(bArr, i) & 4294967295L) | ((aR(bArr, i2) & 4294967295L) << 32);
    }

    public static short aT(byte[] bArr, int i) {
        return (short) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
    }

    public static void aU(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
    }

    public static void aV(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
    }

    public static void aW(long j, byte[] bArr, int i) {
        aU((int) (j >>> 32), bArr, i);
        aU((int) (j & 4294967295L), bArr, i + 4);
    }

    public static void aX(long j, byte[] bArr, int i) {
        aV((int) (4294967295L & j), bArr, i);
        aV((int) (j >>> 32), bArr, i + 4);
    }

    public static int aY(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static boolean aZ(Object obj, Object obj2) {
        if (obj != obj2) {
            return (obj == null || obj2 == null || !obj.equals(obj2)) ? false : true;
        }
        return true;
    }

    public static final vsz aa(vtj vtjVar, byte[] bArr) {
        vtjVar.ai();
        return new vsw(bArr);
    }

    public static final void ab(vrz vrzVar, Map map, Map map2) {
        if (map2.containsKey(vrzVar)) {
            Object obj = ((xqr) map2.get(vrzVar)).b;
        } else {
            map.containsKey(vrzVar);
        }
        if (map2.containsKey(vrzVar)) {
            if (((xqr) map2.get(vrzVar)).b != null) {
                boolean z = ((xqr) map2.get(vrzVar)).a;
            }
        } else if (map.containsKey(vrzVar)) {
            boolean z2 = ((vsa) map.get(vrzVar)).c;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ac(defpackage.vrz r7, java.lang.Object r8, java.util.Map r9) {
        /*
            int r0 = r7.bf
            int r1 = r0 + (-1)
            r2 = 0
            if (r0 == 0) goto L6a
            r3 = 0
            r4 = 1
            switch(r1) {
                case 0: goto L61;
                case 1: goto L4f;
                case 2: goto L45;
                case 3: goto L3a;
                case 4: goto L2c;
                case 5: goto L1c;
                case 6: goto L61;
                case 7: goto L61;
                default: goto Lc;
            }
        Lc:
            java.lang.String r7 = ad(r0)
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r9 = "Unexpected option type: "
            java.lang.String r7 = r9.concat(r7)
            r8.<init>(r7)
            throw r8
        L1c:
            r0 = r8
            java.lang.Float r0 = (java.lang.Float) r0
            boolean r1 = r0.isNaN()
            if (r1 != 0) goto L56
            boolean r0 = r0.isInfinite()
            if (r0 != 0) goto L56
            goto L43
        L2c:
            r0 = r8
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r5 = 0
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 < 0) goto L56
            goto L43
        L3a:
            r0 = r8
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 < 0) goto L56
        L43:
            r3 = r4
            goto L56
        L45:
            r0 = r8
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.isEmpty()
            r3 = r0 ^ 1
            goto L56
        L4f:
            r0 = r8
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r3 = r0.booleanValue()
        L56:
            if (r3 != 0) goto L61
            xqr r8 = new xqr
            r8.<init>(r2)
            r9.put(r7, r8)
            return
        L61:
            xqr r0 = new xqr
            r0.<init>(r8)
            r9.put(r7, r0)
            return
        L6a:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vxr.ac(vrz, java.lang.Object, java.util.Map):void");
    }

    public static /* synthetic */ String ad(int i) {
        switch (i) {
            case 1:
                return "FIXED_LENGTH_BASE_64";
            case 2:
                return "BOOLEAN";
            case 3:
                return "STRING";
            case 4:
                return "INTEGER";
            case 5:
                return "LONG";
            case 6:
                return "FLOAT";
            case 7:
                return "PREFIX_HEX";
            default:
                return "FIFE_SAFE_BASE_64";
        }
    }

    public static final boolean ae(vrm vrmVar, vrn vrnVar) {
        vrk vrkVar = (vrk) DesugarCollections.unmodifiableMap(vrmVar.b).get(vrnVar.c);
        if (vrkVar != null) {
            return vrkVar.c;
        }
        vrk vrkVar2 = vrq.a;
        return vrq.a.c;
    }

    public static final /* synthetic */ vrn af(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (vrn) vucVarO;
    }

    public static final void ag(String str, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vrn vrnVar = (vrn) vtwVar.b;
        vrn vrnVar2 = vrn.a;
        vrnVar.b |= 1;
        vrnVar.c = str;
    }

    public static final /* synthetic */ vrm ah(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (vrm) vucVarO;
    }

    public static final /* synthetic */ vrk aj(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (vrk) vucVarO;
    }

    public static final void ak(boolean z, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vrk vrkVar = (vrk) vtwVar.b;
        vrk vrkVar2 = vrk.a;
        vrkVar.b |= 1;
        vrkVar.c = z;
    }

    public static final void al(boolean z, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vrk vrkVar = (vrk) vtwVar.b;
        vrk vrkVar2 = vrk.a;
        vrkVar.b |= 2;
        vrkVar.d = z;
    }

    public static final void am(boolean z, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vrk vrkVar = (vrk) vtwVar.b;
        vrk vrkVar2 = vrk.a;
        vrkVar.b |= 4;
        vrkVar.e = z;
    }

    public static final vre an(vre[] vreVarArr, int i) {
        List<vre> listAW = yfm.aW(vreVarArr);
        int size = listAW.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return (vre) yfm.Z(listAW);
        }
        if (size != 2) {
            throw new IllegalArgumentException("Can't combine more than 2 TrailingContent elements");
        }
        ArrayList arrayList = new ArrayList(yfm.z(listAW, 10));
        for (vre vreVar : listAW) {
            vrg vrgVar = vreVar instanceof vrg ? (vrg) vreVar : null;
            if (vrgVar == null) {
                throw new IllegalArgumentException("Can't combine Trailing content with an existing TrailingContentPair");
            }
            arrayList.add(vrgVar);
        }
        return new vrf((vrg) arrayList.get(0), (vrg) arrayList.get(1), i);
    }

    public static /* synthetic */ String ao(int i) {
        return i != 1 ? i != 2 ? "CHECKPOINT_DEACTIVATED" : "APP_DEACTIVATED" : "ACTIVE";
    }

    public static final String ap(String str) {
        return ylh.X(str, '-', (char) 8209);
    }

    public static final String aq(vou vouVar) {
        return ap(vouVar.c);
    }

    public static void ar(ulp ulpVar, Map.Entry entry) {
        vub vubVar = (vub) entry.getKey();
        vwo vwoVar = vwo.DOUBLE;
        switch (vubVar.b.ordinal()) {
            case 0:
                ulpVar.B(vubVar.a, ((Double) entry.getValue()).doubleValue());
                break;
            case 1:
                ulpVar.F(vubVar.a, ((Float) entry.getValue()).floatValue());
                break;
            case 2:
                ulpVar.I(vubVar.a, ((Long) entry.getValue()).longValue());
                break;
            case 3:
                ulpVar.R(vubVar.a, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                ulpVar.H(vubVar.a, ((Integer) entry.getValue()).intValue());
                break;
            case 5:
                ulpVar.E(vubVar.a, ((Long) entry.getValue()).longValue());
                break;
            case 6:
                ulpVar.D(vubVar.a, ((Integer) entry.getValue()).intValue());
                break;
            case 7:
                ulpVar.z(vubVar.a, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 8:
                ulpVar.P(vubVar.a, (String) entry.getValue());
                break;
            case 9:
                ulpVar.G(vubVar.a, entry.getValue(), vvs.a.a(entry.getValue().getClass()));
                break;
            case 10:
                ulpVar.J(vubVar.a, entry.getValue(), vvs.a.a(entry.getValue().getClass()));
                break;
            case 11:
                ulpVar.A(vubVar.a, (vsz) entry.getValue());
                break;
            case 12:
                ulpVar.Q(vubVar.a, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                ulpVar.H(vubVar.a, ((Integer) entry.getValue()).intValue());
                break;
            case 14:
                ulpVar.L(vubVar.a, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                ulpVar.M(vubVar.a, ((Long) entry.getValue()).longValue());
                break;
            case 16:
                ulpVar.N(vubVar.a, ((Integer) entry.getValue()).intValue());
                break;
            case 17:
                ulpVar.O(vubVar.a, ((Long) entry.getValue()).longValue());
                break;
        }
    }

    public static long as(DataInput dataInput) throws IOException {
        long unsignedByte;
        long j;
        int unsignedByte2 = dataInput.readUnsignedByte();
        int i = unsignedByte2 >> 6;
        if (i == 1) {
            unsignedByte = dataInput.readUnsignedByte() | ((unsignedByte2 << 26) >> 2) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8);
            j = 60000;
        } else if (i == 2) {
            unsignedByte = ((unsignedByte2 << 58) >> 26) | (dataInput.readUnsignedByte() << 24) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8) | dataInput.readUnsignedByte();
            j = 1000;
        } else {
            if (i == 3) {
                return dataInput.readLong();
            }
            unsignedByte = (unsignedByte2 << 26) >> 26;
            j = 1800000;
        }
        return unsignedByte * j;
    }

    public static aabs at(DataInput dataInput, String str) throws IOException {
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte == 67) {
            return new aafv(aafy.c(dataInput, str));
        }
        if (unsignedByte != 70) {
            if (unsignedByte == 80) {
                return aafy.c(dataInput, str);
            }
            throw new IOException("Invalid encoding");
        }
        aagb aagbVar = new aagb(str, dataInput.readUTF(), (int) as(dataInput), (int) as(dataInput));
        aabs aabsVar = aabs.b;
        return aagbVar.equals(aabsVar) ? aabsVar : aagbVar;
    }

    public static int au(long j) {
        if (j < -2147483648L || j > 2147483647L) {
            throw new ArithmeticException(a.cs(j, "Value cannot fit in an int: "));
        }
        return (int) j;
    }

    public static long av(long j, long j2) {
        long j3 = j + j2;
        if ((j ^ j3) >= 0 || (j ^ j2) < 0) {
            return j3;
        }
        throw new ArithmeticException(a.cv(j2, j, "The calculation caused an overflow: ", " + "));
    }

    public static long aw(long j, int i) {
        long j2 = i;
        long j3 = j * j2;
        if (j3 / j2 == j) {
            return j3;
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j + " * " + i);
    }

    public static long ax(long j, long j2) {
        long j3 = j - j2;
        if ((j ^ j3) >= 0 || (j ^ j2) >= 0) {
            return j3;
        }
        throw new ArithmeticException(a.cv(j2, j, "The calculation caused an overflow: ", " - "));
    }

    public static void ay(aabm aabmVar, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new aabx(aabmVar.r(), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    public static void az(aabo aaboVar, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new aabx(aaboVar, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    public static vwe b(Instant instant) {
        return vxf.f(instant.getEpochSecond(), instant.getNano());
    }

    public static byte[] bA(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("src == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("length hast to be >= 0");
        }
        if (i + i2 > bArr.length) {
            throw new IllegalArgumentException("offset + length must not be greater then size of source array");
        }
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr2[i3] = bArr[i + i3];
        }
        return bArr2;
    }

    public static byte[] bB(Object obj) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] bC(long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = i - 1; i2 >= 0; i2--) {
            bArr[i2] = (byte) j;
            j >>>= 8;
        }
        return bArr;
    }

    public static byte[][] bD(byte[][] bArr) {
        if (bx(bArr)) {
            throw new NullPointerException("in has null pointers");
        }
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i = 0; i < bArr.length; i++) {
            byte[] bArr3 = new byte[bArr[i].length];
            bArr2[i] = bArr3;
            byte[] bArr4 = bArr[i];
            System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
        }
        return bArr2;
    }

    public static long bE(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("in == null");
        }
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public static zvl bF(zva zvaVar, zvl zvlVar, zvl zvlVar2, zve zveVar) {
        if (zvlVar == null) {
            throw new NullPointerException("left == null");
        }
        if (zvlVar2 == null) {
            throw new NullPointerException("right == null");
        }
        int i = zvlVar.a;
        if (i != zvlVar2.a) {
            throw new IllegalStateException("height of both nodes must be equal");
        }
        byte[] bArrBd = bd(zvaVar.c);
        if (zveVar instanceof zux) {
            zux zuxVar = (zux) zveVar;
            zuy zuyVar = new zuy(null);
            zuyVar.e = zuxVar.d;
            zuyVar.f = zuxVar.e;
            zuyVar.b = zuxVar.a;
            zuyVar.c = zuxVar.b;
            zuyVar.a = zuxVar.c;
            zuyVar.g = 0;
            zveVar = new zux(zuyVar);
        } else if (zveVar instanceof zuv) {
            zuv zuvVar = (zuv) zveVar;
            zuu zuuVar = new zuu();
            zuuVar.e = zuvVar.d;
            zuuVar.f = zuvVar.e;
            zuuVar.a = zuvVar.a;
            zuuVar.b = zuvVar.b;
            zuuVar.g = 0;
            zveVar = new zuv(zuuVar);
        }
        zuw zuwVar = zvaVar.b;
        byte[] bArrA = zuwVar.a(bArrBd, zveVar.a());
        if (zveVar instanceof zux) {
            zux zuxVar2 = (zux) zveVar;
            zuy zuyVar2 = new zuy(null);
            zuyVar2.e = zuxVar2.d;
            zuyVar2.f = zuxVar2.e;
            zuyVar2.b = zuxVar2.a;
            zuyVar2.c = zuxVar2.b;
            zuyVar2.a = zuxVar2.c;
            zuyVar2.g = 1;
            zveVar = new zux(zuyVar2);
        } else if (zveVar instanceof zuv) {
            zuv zuvVar2 = (zuv) zveVar;
            zuu zuuVar2 = new zuu();
            zuuVar2.e = zuvVar2.d;
            zuuVar2.f = zuvVar2.e;
            zuuVar2.a = zuvVar2.a;
            zuuVar2.b = zuvVar2.b;
            zuuVar2.g = 1;
            zveVar = new zuv(zuuVar2);
        }
        byte[] bArrA2 = zuwVar.a(bArrBd, zveVar.a());
        if (zveVar instanceof zux) {
            zux zuxVar3 = (zux) zveVar;
            zuy zuyVar3 = new zuy(null);
            zuyVar3.e = zuxVar3.d;
            zuyVar3.f = zuxVar3.e;
            zuyVar3.b = zuxVar3.a;
            zuyVar3.c = zuxVar3.b;
            zuyVar3.a = zuxVar3.c;
            zuyVar3.g = 2;
            zveVar = new zux(zuyVar3);
        } else if (zveVar instanceof zuv) {
            zuv zuvVar3 = (zuv) zveVar;
            zuu zuuVar3 = new zuu();
            zuuVar3.e = zuvVar3.d;
            zuuVar3.f = zuvVar3.e;
            zuuVar3.a = zuvVar3.a;
            zuuVar3.b = zuvVar3.b;
            zuuVar3.g = 2;
            zveVar = new zuv(zuuVar3);
        }
        byte[] bArrA3 = zuwVar.a(bArrBd, zveVar.a());
        int i2 = zvaVar.a.a;
        int i3 = i2 + i2;
        byte[] bArr = new byte[i3];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) (zvlVar.a()[i4] ^ bArrA2[i4]);
        }
        for (int i5 = 0; i5 < i2; i5++) {
            bArr[i5 + i2] = (byte) (zvlVar2.a()[i5] ^ bArrA3[i5]);
        }
        int length = bArrA.length;
        int i6 = zuwVar.a;
        if (length != i6) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (i3 == i6 + i6) {
            return new zvl(i, zuwVar.b(1, bArrA, bArr));
        }
        throw new IllegalArgumentException("wrong in length");
    }

    public static zvl bG(zva zvaVar, zyt zytVar, zux zuxVar) {
        double d;
        int iCeil = zvaVar.a.b;
        byte[][] bArrBD = bD((byte[][]) zytVar.a);
        zvl[] zvlVarArr = new zvl[bArrBD.length];
        for (int i = 0; i < bArrBD.length; i++) {
            zvlVarArr[i] = new zvl(0, bArrBD[i]);
        }
        zuy zuyVar = new zuy(null);
        zuyVar.e = zuxVar.d;
        zuyVar.f = zuxVar.e;
        zuyVar.b = zuxVar.a;
        zuyVar.c = 0;
        zuyVar.a = zuxVar.c;
        zuyVar.g = zuxVar.f;
        zux zuxVar2 = new zux(zuyVar);
        while (iCeil > 1) {
            int i2 = 0;
            while (true) {
                d = iCeil >> 1;
                if (i2 >= ((int) Math.floor(d))) {
                    break;
                }
                zuy zuyVar2 = new zuy(null);
                zuyVar2.e = zuxVar2.d;
                zuyVar2.f = zuxVar2.e;
                zuyVar2.b = zuxVar2.a;
                zuyVar2.c = zuxVar2.b;
                zuyVar2.a = i2;
                zuyVar2.g = zuxVar2.f;
                zuxVar2 = new zux(zuyVar2);
                int i3 = i2 + i2;
                zvlVarArr[i2] = bF(zvaVar, zvlVarArr[i3], zvlVarArr[i3 + 1], zuxVar2);
                i2++;
            }
            if ((iCeil & 1) == 1) {
                zvlVarArr[(int) Math.floor(d)] = zvlVarArr[iCeil - 1];
            }
            iCeil = (int) Math.ceil(iCeil / 2.0d);
            zuy zuyVar3 = new zuy(null);
            zuyVar3.e = zuxVar2.d;
            zuyVar3.f = zuxVar2.e;
            zuyVar3.b = zuxVar2.a;
            zuyVar3.c = zuxVar2.b + 1;
            zuyVar3.a = zuxVar2.c;
            zuyVar3.g = zuxVar2.f;
            zuxVar2 = new zux(zuyVar3);
        }
        return zvlVarArr[0];
    }

    public static zmw bH(zod zodVar) throws IOException {
        if (zodVar instanceof zxe) {
            zxe zxeVar = (zxe) zodVar;
            return new zmw(zun.s(zxeVar.b), bd(zxeVar.c));
        }
        if (zodVar instanceof zti) {
            zti ztiVar = (zti) zodVar;
            return new zmw(new zmd(zqa.d, new zqb(zun.t(ztiVar.b))), ztiVar.a());
        }
        if (zodVar instanceof zsf) {
            return new zmw(new zmd(zqa.e), ((zsf) zodVar).a());
        }
        if (zodVar instanceof zsa) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            wef.T(1, byteArrayOutputStream);
            wef.Q((zsa) zodVar, byteArrayOutputStream);
            return new zmw(new zmd(zlp.C), new zkn(byteArrayOutputStream.toByteArray()));
        }
        if (zodVar instanceof zru) {
            zru zruVar = (zru) zodVar;
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            wef.T(zruVar.b, byteArrayOutputStream2);
            wef.Q(zruVar.c, byteArrayOutputStream2);
            return new zmw(new zmd(zlp.C), new zkn(byteArrayOutputStream2.toByteArray()));
        }
        if (zodVar instanceof ztp) {
            ztp ztpVar = (ztp) zodVar;
            return new zmw(new zmd(zun.q(ztpVar.b)), ztpVar.a());
        }
        if (zodVar instanceof zqs) {
            zqs zqsVar = (zqs) zodVar;
            return new zmw(new zmd(zun.j(zqsVar.b)), zqsVar.a());
        }
        if (zodVar instanceof zvr) {
            zvr zvrVar = (zvr) zodVar;
            byte[] bArrBz = bz(zvrVar.e);
            byte[] bArrBz2 = bz(zvrVar.d);
            byte[] bArrA = zvrVar.a();
            if (bArrA.length > bArrBz.length + bArrBz2.length) {
                return new zmw(new zmd(zok.a), new zkn(bArrA));
            }
            return new zmw(new zmd(zqa.f, new zqe(zvrVar.c.c, zun.u(zvrVar.b))), new zqj(bArrBz, bArrBz2));
        }
        if (zodVar instanceof zvk) {
            zvk zvkVar = (zvk) zodVar;
            byte[] bArrA2 = zvkVar.a();
            byte[] bArrB = zvkVar.b();
            byte[] bArrC = zvkVar.c();
            if (bArrC.length > bArrA2.length + bArrB.length) {
                return new zmw(new zmd(zok.b), new zkn(bArrC));
            }
            zvh zvhVar = zvkVar.c;
            return new zmw(new zmd(zqa.g, new zqf(zvhVar.d, zvhVar.e, zun.u(zvkVar.b))), new zqh(zvkVar.a(), zvkVar.b()));
        }
        if (zodVar instanceof zxc) {
            zxc zxcVar = (zxc) zodVar;
            return new zmw(new zmd(zqa.c), new zpz(zxcVar.c, zxcVar.d, zxcVar.e, zun.r(zxcVar.b)));
        }
        if (zodVar instanceof zrn) {
            zrn zrnVar = (zrn) zodVar;
            return new zmw(new zmd(zun.g(zrnVar.b)), new zkn(bd(zrnVar.c)));
        }
        if (zodVar instanceof ztf) {
            ztf ztfVar = (ztf) zodVar;
            return new zmw(new zmd(zun.o(ztfVar.b)), new zkq(new zkn(bd(ztfVar.c))));
        }
        if (zodVar instanceof zsv) {
            zsv zsvVar = (zsv) zodVar;
            return new zmw(new zmd(zun.m(zsvVar.b)), new zkn(zsvVar.a()));
        }
        if (zodVar instanceof zsj) {
            zsj zsjVar = (zsj) zodVar;
            return new zmw(new zmd(zun.k(zsjVar.b)), new zkn(zsjVar.a()));
        }
        if (zodVar instanceof zrj) {
            zrj zrjVar = (zrj) zodVar;
            byte[] bArrBd = bd(zrjVar.c);
            zrh zrhVar = zrjVar.b;
            zmd zmdVar = new zmd(zun.f(zrhVar));
            int length = bArrBd.length;
            byte[] bArr = new byte[length + 1];
            bArr[0] = (byte) zrhVar.d;
            System.arraycopy(bArrBd, 0, bArr, 1, length);
            return new zmw(zmdVar, bArr);
        }
        if (zodVar instanceof zrf) {
            zrf zrfVar = (zrf) zodVar;
            return new zmw(new zmd(zun.i(zrfVar.b)), bf(zrfVar.c, zrfVar.d));
        }
        if (zodVar instanceof zsn) {
            zsn zsnVar = (zsn) zodVar;
            zsl zslVar = zsnVar.b;
            byte[] bArr2 = new byte[zslVar.g];
            byte[] bArr3 = zsnVar.c;
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, 0, length2);
            byte[] bArr4 = zsnVar.d;
            System.arraycopy(bArr4, 0, bArr2, length2, bArr4.length);
            return new zmw(new zmd(zun.l(zslVar)), new zkn(bArr2));
        }
        if (zodVar instanceof zsr) {
            zsr zsrVar = (zsr) zodVar;
            return new zmw(new zmd(zun.p(zsrVar.b)), new zkn(bd(zsrVar.c)));
        }
        if (zodVar instanceof zra) {
            zra zraVar = (zra) zodVar;
            return new zmw(new zmd(zun.e(zraVar.b)), zraVar.a());
        }
        if (zodVar instanceof zqn) {
            zqn zqnVar = (zqn) zodVar;
            return new zmw(new zmd(zun.d(zqnVar.b)), zqnVar.a());
        }
        if (zodVar instanceof zrr) {
            zrr zrrVar = (zrr) zodVar;
            return new zmw(new zmd(zun.h(zrrVar.b)), zrrVar.a());
        }
        if (!(zodVar instanceof ztb)) {
            throw new IOException("key parameters not recognized");
        }
        ztb ztbVar = (ztb) zodVar;
        zsz zszVar = ztbVar.b;
        return new zmw(new zmd(zun.n(zszVar)), new zkn(zszVar.m != 1 ? bf(bf(bf(bf(bf(ztbVar.d, wef.B(ztbVar.e, false)), wef.B(ztbVar.f, true)), wef.B(ztbVar.g, false)), wef.B(ztbVar.h, true)), wef.B(ztbVar.i, true)) : wef.B(ztbVar.c, true)));
    }

    public static zlq bI(zod zodVar, zjo zjoVar) throws IOException {
        int i;
        int i2;
        int i3;
        byte[][] bArr;
        int i4;
        int i5;
        long jAS;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        zqq zqqVar;
        if (zodVar instanceof zxd) {
            zxd zxdVar = (zxd) zodVar;
            return new zlq(zun.s(zxdVar.b), new zkn(bd(zxdVar.c)), zjoVar);
        }
        if (zodVar instanceof zth) {
            zth zthVar = (zth) zodVar;
            return new zlq(new zmd(zqa.d, new zqb(zun.t(zthVar.b))), new zkn(zthVar.a()));
        }
        if (zodVar instanceof zse) {
            zmd zmdVar = new zmd(zqa.e);
            short[] sArrA = ((zse) zodVar).a();
            int length = sArrA.length;
            byte[] bArr2 = new byte[length + length];
            for (int i12 = 0; i12 != sArrA.length; i12++) {
                short s = sArrA[i12];
                int i13 = i12 + i12;
                bArr2[i13] = (byte) s;
                bArr2[i13 + 1] = (byte) (s >>> 8);
            }
            return new zlq(zmdVar, new zkn(bArr2));
        }
        if (zodVar instanceof zrz) {
            zrz zrzVar = (zrz) zodVar;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            wef.T(1, byteArrayOutputStream);
            wef.Q(zrzVar, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            wef.T(1, byteArrayOutputStream2);
            wef.Q(zrzVar.b(), byteArrayOutputStream2);
            return new zlq(new zmd(zlp.C), new zkn(byteArray), zjoVar, byteArrayOutputStream2.toByteArray());
        }
        if (zodVar instanceof zrt) {
            zrt zrtVar = (zrt) zodVar;
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i14 = zrtVar.b;
            wef.T(i14, byteArrayOutputStream3);
            wef.Q(zrtVar, byteArrayOutputStream3);
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            wef.T(i14, byteArrayOutputStream4);
            wef.Q(zrtVar.b().c, byteArrayOutputStream4);
            return new zlq(new zmd(zlp.C), new zkn(byteArray2), zjoVar, byteArrayOutputStream4.toByteArray());
        }
        if (zodVar instanceof zto) {
            zto ztoVar = (zto) zodVar;
            zmd zmdVar2 = new zmd(zun.q(ztoVar.b));
            zkn zknVar = new zkn(ztoVar.a());
            ztj ztjVar = ztoVar.d;
            return new zlq(zmdVar2, zknVar, zjoVar, bf((byte[]) ztjVar.a, (byte[]) ztjVar.b));
        }
        if (zodVar instanceof zsu) {
            zsu zsuVar = (zsu) zodVar;
            return new zlq(new zmd(zun.m(zsuVar.b)), new zkn(zsuVar.a()), zjoVar);
        }
        if (!(zodVar instanceof zqr)) {
            if (zodVar instanceof zvp) {
                zvp zvpVar = (zvp) zodVar;
                zvn zvnVar = zvpVar.c;
                int i15 = zvnVar.c;
                zmd zmdVar3 = new zmd(zqa.f, new zqe(i15, zun.u(zvpVar.b)));
                byte[] bArrS = zvpVar.s();
                int i16 = zvnVar.f;
                int iBE = (int) bE(bArrS, 4);
                if (!by(i15, iBE)) {
                    throw new IllegalArgumentException("index out of bounds");
                }
                byte[] bArrBA = bA(bArrS, 4, i16);
                int i17 = i16 + 4;
                byte[] bArrBA2 = bA(bArrS, i17, i16);
                int i18 = i17 + i16;
                byte[] bArrBA3 = bA(bArrS, i18, i16);
                int i19 = i18 + i16;
                byte[] bArrBA4 = bA(bArrS, i19, i16);
                int i20 = i19 + i16;
                byte[] bArrBA5 = bA(bArrS, i20, bArrS.length - i20);
                try {
                    int i21 = ((zuo) bv(bArrBA5, zuo.class)).b;
                    return new zlq(zmdVar3, i21 != (1 << i15) + (-1) ? new zqi(iBE, bArrBA, bArrBA2, bArrBA3, bArrBA4, bArrBA5, i21) : new zqi(iBE, bArrBA, bArrBA2, bArrBA3, bArrBA4, bArrBA5), zjoVar);
                } catch (ClassNotFoundException e) {
                    throw new IOException("cannot parse BDS: ".concat(String.valueOf(e.getMessage())));
                }
            }
            if (zodVar instanceof zvj) {
                zvj zvjVar = (zvj) zodVar;
                zvh zvhVar = zvjVar.c;
                int i22 = zvhVar.d;
                zmd zmdVar4 = new zmd(zqa.g, new zqf(i22, zvhVar.e, zun.u(zvjVar.b)));
                byte[] bArrS2 = zvjVar.s();
                int iA = zvhVar.a();
                int i23 = (i22 + 7) / 8;
                long jBE = (int) bE(bArrS2, i23);
                if (!by(i22, jBE)) {
                    throw new IllegalArgumentException("index out of bounds");
                }
                byte[] bArrBA6 = bA(bArrS2, i23, iA);
                int i24 = i23 + iA;
                byte[] bArrBA7 = bA(bArrS2, i24, iA);
                int i25 = i24 + iA;
                byte[] bArrBA8 = bA(bArrS2, i25, iA);
                int i26 = i25 + iA;
                byte[] bArrBA9 = bA(bArrS2, i26, iA);
                int i27 = i26 + iA;
                byte[] bArrBA10 = bA(bArrS2, i27, bArrS2.length - i27);
                try {
                    long j = ((zup) bv(bArrBA10, zup.class)).b;
                    return new zlq(zmdVar4, j != (1 << i22) + (-1) ? new zqg(jBE, bArrBA6, bArrBA7, bArrBA8, bArrBA9, bArrBA10, j) : new zqg(jBE, bArrBA6, bArrBA7, bArrBA8, bArrBA9, bArrBA10), zjoVar);
                } catch (ClassNotFoundException e2) {
                    throw new IOException("cannot parse BDSStateMap: ".concat(String.valueOf(e2.getMessage())));
                }
            }
            if (zodVar instanceof zxb) {
                zxb zxbVar = (zxb) zodVar;
                return new zlq(new zmd(zqa.c), new zpy(zxbVar.c, zxbVar.d, zxbVar.e, zxbVar.f, zxbVar.g, zun.r(zxbVar.b)));
            }
            if (zodVar instanceof zrm) {
                zrm zrmVar = (zrm) zodVar;
                return new zlq(new zmd(zun.g(zrmVar.b)), new zkn(bd(zrmVar.c)), zjoVar);
            }
            if (zodVar instanceof zte) {
                zte zteVar = (zte) zodVar;
                return new zlq(new zmd(zun.o(zteVar.b)), new zkn(bd(zteVar.c)), zjoVar);
            }
            if (zodVar instanceof zsi) {
                zsi zsiVar = (zsi) zodVar;
                return new zlq(new zmd(zun.k(zsiVar.b)), new zkn(zsiVar.a()), zjoVar);
            }
            if (zodVar instanceof zri) {
                zri zriVar = (zri) zodVar;
                return new zlq(new zmd(zun.f(zriVar.b)), new zpv(bd(zriVar.d), bd(zriVar.e), bd(zriVar.f), new zpw(bd(zriVar.c))), zjoVar);
            }
            if (zodVar instanceof zre) {
                zre zreVar = (zre) zodVar;
                return new zlq(new zmd(zun.i(zreVar.b)), new zkn(be(new byte[][]{zreVar.c, zreVar.f, zreVar.g, zreVar.d, zreVar.e})), zjoVar);
            }
            if (zodVar instanceof zsm) {
                zsm zsmVar = (zsm) zodVar;
                zii ziiVar = new zii();
                ziiVar.b(new zkn(bd(zsmVar.c)));
                ziiVar.b(new zkn(bd(zsmVar.d)));
                ziiVar.b(new zkn(bd(zsmVar.e)));
                ziiVar.b(new zkn(bd(zsmVar.f)));
                return new zlq(new zmd(zun.l(zsmVar.b)), new zkq(ziiVar), zjoVar);
            }
            if (zodVar instanceof zsq) {
                zsq zsqVar = (zsq) zodVar;
                zii ziiVar2 = new zii();
                ziiVar2.b(new zkn(bd(zsqVar.c)));
                ziiVar2.b(new zkn(bd(zsqVar.d)));
                ziiVar2.b(new zkn(bd(zsqVar.e)));
                ziiVar2.b(new zkn(bd(zsqVar.f)));
                ziiVar2.b(new zkn(bd(zsqVar.g)));
                return new zlq(new zmd(zun.p(zsqVar.b)), new zkq(ziiVar2), zjoVar);
            }
            if (zodVar instanceof zqz) {
                zqz zqzVar = (zqz) zodVar;
                zqy zqyVar = zqzVar.b;
                zmd zmdVar5 = new zmd(zun.e(zqyVar));
                byte[] bArr3 = zqzVar.c;
                return new zlq(zmdVar5, new zkn(be(new byte[][]{bArr3, zqzVar.d, zqzVar.e, zqzVar.f, zqzVar.g, zqzVar.h})), zjoVar, new zra(zqyVar, bArr3, zqzVar.i).a());
            }
            if (zodVar instanceof zqm) {
                zqm zqmVar = (zqm) zodVar;
                return new zlq(new zmd(zun.d(zqmVar.b)), new zkn(zqmVar.a()), zjoVar);
            }
            if (zodVar instanceof zrq) {
                zrq zrqVar = (zrq) zodVar;
                return new zlq(new zmd(zun.h(zrqVar.b)), new zkn(zrqVar.a()), zjoVar);
            }
            if (!(zodVar instanceof zta)) {
                throw new IOException("key parameters not recognized");
            }
            zta ztaVar = (zta) zodVar;
            zsz zszVar = ztaVar.b;
            return new zlq(new zmd(zun.n(zszVar)), new zkn(zszVar.m == 3 ? bf(ztaVar.o, ztaVar.c) : bf(bf(bf(bf(bf(bf(bf(bf(bf(bf(bf(bf(ztaVar.c, wef.A(ztaVar.d)), wef.A(ztaVar.e)), wef.A(ztaVar.g)), wef.A(ztaVar.f)), wef.B(ztaVar.h, true)), wef.B(ztaVar.i, false)), wef.B(ztaVar.j, true)), wef.B(ztaVar.k, false)), wef.B(ztaVar.l, false)), wef.B(ztaVar.m, true)), wef.B(ztaVar.n, false)), ztaVar.p)), zjoVar);
        }
        zqr zqrVar = (zqr) zodVar;
        zqq zqqVar2 = zqrVar.b;
        zmd zmdVar6 = new zmd(zun.j(zqqVar2));
        zqo zqoVar = zqqVar2.m;
        byte[] bArr4 = new byte[zqoVar.a()];
        byte[] bArr5 = zqrVar.c;
        byte[] bArr6 = new byte[zqoVar.a()];
        int i28 = zqoVar.c;
        int i29 = 1 << i28;
        short[] sArr = new short[i29];
        long[] jArr = {0};
        int i30 = zqoVar.a;
        int i31 = 8;
        int i32 = i30 >> 3;
        int[] iArr = new int[i29];
        int i33 = i29 * 4;
        int i34 = i32 + i33;
        byte[] bArr7 = new byte[i34];
        int i35 = zqoVar.d;
        zoa zoaVar = new zoa(256);
        zoaVar.f((byte) 64);
        zoaVar.g(bArr5, 0, 32);
        zoaVar.l(bArr7, 0, i34);
        for (int i36 = 0; i36 < i29; i36++) {
            iArr[i36] = aR(bArr7, (((i34 - 32) - i35) - i33) + (i36 * 4));
        }
        int i37 = zqoVar.b;
        short[] sArr2 = new short[i37 + 1];
        sArr2[i37] = 1;
        for (int i38 = 0; i38 < i37; i38++) {
            sArr2[i38] = (short) (aT(bArr5, i38 + i38 + 40) & zqoVar.f);
        }
        long[] jArr2 = new long[i29];
        int i39 = 0;
        while (i39 < i29) {
            long[] jArr3 = jArr2;
            long j2 = iArr[i39];
            jArr3[i39] = j2;
            long j3 = j2 << 31;
            jArr3[i39] = j3;
            long j4 = j3 | i39;
            jArr3[i39] = j4;
            jArr3[i39] = j4 & Long.MAX_VALUE;
            i39++;
            jArr2 = jArr3;
        }
        long[] jArr4 = jArr2;
        int i40 = 1;
        while (i40 < i29 - i40) {
            i40 += i40;
        }
        int i41 = i40;
        while (i41 > 0) {
            short[] sArr3 = sArr2;
            int i42 = 0;
            while (i42 < i29 - i41) {
                if ((i42 & i41) == 0) {
                    int i43 = i42 + i41;
                    long j5 = jArr4[i43];
                    long j6 = jArr4[i42];
                    i11 = i42;
                    zqqVar = zqqVar2;
                    long j7 = (-((j5 - j6) >>> 63)) & (j6 ^ j5);
                    jArr4[i11] = j6 ^ j7;
                    jArr4[i43] = jArr4[i43] ^ j7;
                } else {
                    i11 = i42;
                    zqqVar = zqqVar2;
                }
                i42 = i11 + 1;
                zqqVar2 = zqqVar;
            }
            zqq zqqVar3 = zqqVar2;
            int i44 = 0;
            for (int i45 = i40; i45 > i41; i45 >>>= 1) {
                while (i44 < i29 - i45) {
                    if ((i44 & i41) == 0) {
                        int i46 = i44 + i41;
                        long j8 = jArr4[i46];
                        i8 = i44;
                        int i47 = i45;
                        while (i47 > i41) {
                            int i48 = i8 + i47;
                            long j9 = jArr4[i48];
                            int i49 = i40;
                            long j10 = (-((j9 - j8) >>> 63)) & (j8 ^ j9);
                            j8 ^= j10;
                            jArr4[i48] = j9 ^ j10;
                            i47 >>>= 1;
                            i40 = i49;
                            i41 = i41;
                        }
                        i9 = i40;
                        i10 = i41;
                        jArr4[i46] = j8;
                    } else {
                        i8 = i44;
                        i9 = i40;
                        i10 = i41;
                    }
                    i44 = i8 + 1;
                    i40 = i9;
                    i41 = i10;
                }
            }
            i41 >>>= 1;
            sArr2 = sArr3;
            zqqVar2 = zqqVar3;
        }
        short[] sArr4 = sArr2;
        zqq zqqVar4 = zqqVar2;
        int i50 = 1;
        while (true) {
            if (i50 >= i29) {
                short[] sArr5 = new short[i30];
                int i51 = 0;
                while (i51 < i29) {
                    int i52 = i51;
                    sArr[i52] = (short) (zqoVar.f & jArr4[i51]);
                    i51 = i52 + 1;
                    i29 = i29;
                }
                for (int i53 = 0; i53 < i30; i53++) {
                    short s2 = sArr[i53];
                    short s3 = (short) (((s2 >> 8) & 255) | ((s2 & 255) << 8));
                    short s4 = (short) (((s3 & 3855) << 4) | ((s3 >> 4) & 3855));
                    short s5 = (short) (((s4 & 13107) << 2) | ((s4 >> 2) & 13107));
                    int i54 = s5 >> 1;
                    int i55 = s5 & 21845;
                    short s6 = (short) ((i55 + i55) | (i54 & 21845));
                    sArr5[i53] = (short) (i28 == 12 ? s6 >> 4 : s6 >> 3);
                }
                short[] sArr6 = new short[i30];
                for (int i56 = 0; i56 < i30; i56++) {
                    short s7 = sArr5[i56];
                    short sB = sArr4[i37];
                    int i57 = i37 - 1;
                    while (i57 >= 0) {
                        sB = (short) (zqoVar.g.b(sB, s7) ^ sArr4[i57]);
                        i57--;
                        sArr5 = sArr5;
                    }
                    sArr6[i56] = sB;
                }
                short[] sArr7 = sArr5;
                for (int i58 = 0; i58 < i30; i58++) {
                    sArr6[i58] = zqoVar.g.a(sArr6[i58]);
                }
                int i59 = zqoVar.e;
                byte b2 = 0;
                byte[][] bArr8 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i59, i32);
                int i60 = 0;
                while (i60 < i59) {
                    int i61 = b2;
                    while (i61 < i32) {
                        bArr8[i60][i61] = b2;
                        i61++;
                        b2 = 0;
                    }
                    i60++;
                    b2 = 0;
                }
                int i62 = 0;
                while (i62 < i37) {
                    for (int i63 = 0; i63 < i30; i63 += 8) {
                        int i64 = 0;
                        while (i64 < i28) {
                            int i65 = (sArr6[i63 + 7] >>> i64) & 1;
                            int i66 = (sArr6[i63 + 6] >>> i64) & 1;
                            int i67 = (i65 + i65) | i66;
                            int i68 = (i67 + i67) | ((sArr6[i63 + 5] >>> i64) & 1);
                            int i69 = (i68 + i68) | ((sArr6[i63 + 4] >>> i64) & 1);
                            int i70 = (i69 + i69) | ((sArr6[i63 + 3] >>> i64) & 1);
                            int i71 = (i70 + i70) | ((sArr6[i63 + 2] >>> i64) & 1);
                            int i72 = (i71 + i71) | ((sArr6[i63 + 1] >>> i64) & 1);
                            bArr8[(i62 * i28) + i64][i63 / 8] = (byte) (((byte) (i72 + i72)) | ((sArr6[i63] >>> i64) & 1));
                            i64++;
                            i37 = i37;
                        }
                    }
                    int i73 = i37;
                    int i74 = 0;
                    while (i74 < i30) {
                        int i75 = i74;
                        sArr6[i75] = zqoVar.g.b(sArr6[i74], sArr7[i75]);
                        i74 = i75 + 1;
                    }
                    i62++;
                    i37 = i73;
                }
                int i76 = 0;
                loop22: while (true) {
                    if (i76 < i59) {
                        int i77 = i76 >>> 3;
                        int i78 = i76 & 7;
                        if (zqoVar.i && i76 == i59 - 32) {
                            long[] jArr5 = new long[64];
                            i2 = i30;
                            long[] jArr6 = new long[32];
                            boolean z = zqoVar.h;
                            int i79 = i5 & 7;
                            int i80 = i5 >> 3;
                            i3 = i78;
                            byte[] bArr9 = new byte[9];
                            if (z) {
                                bArr = bArr8;
                                int i81 = 0;
                                while (i81 < 32) {
                                    int i82 = i81;
                                    for (int i83 = 0; i83 < 9; i83++) {
                                        bArr9[i83] = bArr[i5 + i82][i80 + i83];
                                    }
                                    int i84 = 0;
                                    for (int i85 = i31; i84 < i85; i85 = 8) {
                                        int i86 = i84;
                                        int i87 = i86 + 1;
                                        bArr9[i86] = (byte) (((bArr9[i86] & 255) >> i79) | (bArr9[i87] << (8 - i79)));
                                        i84 = i87;
                                    }
                                    jArr5[i82] = aS(bArr9, 0);
                                    i81 = i82 + 1;
                                    i31 = 8;
                                }
                            } else {
                                bArr = bArr8;
                                for (int i88 = 0; i88 < 32; i88++) {
                                    jArr5[i88] = aS(bArr[i5 + i88], i80);
                                }
                            }
                            jArr[0] = 0;
                            int i89 = 0;
                            int i90 = 32;
                            while (i89 < i90) {
                                int i91 = i89 + 1;
                                int i92 = i77;
                                int i93 = i5;
                                long j11 = jArr5[i89];
                                int i94 = i89;
                                int i95 = i91;
                                while (i95 < i90) {
                                    j11 |= jArr5[i95];
                                    i95++;
                                    i90 = 32;
                                }
                                if (j11 == 0) {
                                    break loop22;
                                }
                                long j12 = ~j11;
                                long j13 = 72340172838076673L;
                                long j14 = 0;
                                for (int i96 = 0; i96 < 8; i96++) {
                                    j13 &= j12 >>> i96;
                                    j14 += j13;
                                }
                                long j15 = j14 & 578721382704613384L;
                                long j16 = j15 | (j15 >>> 1);
                                long j17 = j14 >>> 8;
                                long j18 = j16 | (j16 >>> 2);
                                long j19 = j18;
                                long j20 = j14 + (j17 & j18);
                                int i97 = 2;
                                for (int i98 = 8; i97 < i98; i98 = 8) {
                                    j19 &= j19 >>> i98;
                                    j17 >>>= i98;
                                    j20 += j17 & j19;
                                    i97++;
                                }
                                int i99 = ((int) j20) & 255;
                                long j21 = i99;
                                jArr6[i94] = j21;
                                jArr[0] = jArr[0] | (1 << ((int) j21));
                                int i100 = i91;
                                while (true) {
                                    i7 = 32;
                                    if (i100 >= 32) {
                                        break;
                                    }
                                    jArr5[i94] = jArr5[i94] ^ (jArr5[i100] & (((r11 >> i99) & 1) - 1));
                                    i100++;
                                }
                                int i101 = i91;
                                while (i101 < i7) {
                                    long j22 = jArr5[i101];
                                    int i102 = i101;
                                    jArr5[i102] = j22 ^ (jArr5[i94] & (-((j22 >> i99) & 1)));
                                    i101 = i102 + 1;
                                    i7 = 32;
                                }
                                i90 = i7;
                                i89 = i91;
                                i77 = i92;
                                i5 = i93;
                            }
                            i4 = i77;
                            int i103 = i5;
                            int i104 = 0;
                            while (i104 < i90) {
                                int i105 = i104 + 1;
                                int i106 = i105;
                                while (i106 < 64) {
                                    int i107 = i103 + i104;
                                    short s8 = sArr[i107];
                                    int i108 = i105;
                                    long j23 = (-(((((short) i106) ^ ((short) jArr6[r43])) - 1) >>> 63)) & (s8 ^ sArr[r40]);
                                    sArr[i107] = (short) (s8 ^ j23);
                                    sArr[i103 + i106] = (short) (j23 ^ sArr[r40]);
                                    i106++;
                                    i105 = i108;
                                    i104 = i104;
                                    z = z;
                                }
                                i104 = i105;
                                i90 = 32;
                            }
                            boolean z2 = z;
                            int i109 = 0;
                            while (i109 < i59) {
                                if (z2) {
                                    for (int i110 = 0; i110 < 9; i110++) {
                                        bArr9[i110] = bArr[i109][i80 + i110];
                                    }
                                    int i111 = 0;
                                    while (i111 < 8) {
                                        int i112 = i111 + 1;
                                        bArr9[i111] = (byte) ((bArr9[i112] << (8 - i79)) | ((bArr9[i111] & 255) >> i79));
                                        i111 = i112;
                                    }
                                    jAS = aS(bArr9, 0);
                                } else {
                                    jAS = aS(bArr[i109], i80);
                                }
                                int i113 = 0;
                                while (i113 < 32) {
                                    long j24 = jAS >> i113;
                                    int i114 = i113;
                                    int i115 = (int) jArr6[i114];
                                    long j25 = (j24 ^ (jAS >> i115)) & 1;
                                    long j26 = ((j25 << i115) ^ jAS) ^ (j25 << i114);
                                    i113 = i114 + 1;
                                    jAS = j26;
                                }
                                if (z2) {
                                    int i116 = 8 - i79;
                                    wef.V(bArr9, 0, jAS);
                                    byte[] bArr10 = bArr[i109];
                                    int i117 = i80 + 8;
                                    i6 = i109;
                                    bArr10[i117] = (byte) (((bArr9[7] & 255) >>> i116) | (((bArr10[i117] & 255) >>> i79) << i79));
                                    bArr10[i80] = (byte) (((bArr9[0] & 255) << i79) | (((bArr10[i80] & 255) << i116) >>> i116));
                                    int i118 = 7;
                                    while (i118 > 0) {
                                        byte[] bArr11 = bArr[i6];
                                        int i119 = i80 + i118;
                                        int i120 = (bArr9[i118] & 255) << i79;
                                        int i121 = i118 - 1;
                                        bArr11[i119] = (byte) (((bArr9[i121] & 255) >>> i116) | i120);
                                        i118 = i121;
                                    }
                                } else {
                                    i6 = i109;
                                    wef.V(bArr[i6], i80, jAS);
                                }
                                i109 = i6 + 1;
                            }
                        } else {
                            i2 = i30;
                            i3 = i78;
                            bArr = bArr8;
                            i4 = i77;
                        }
                        int i122 = i76 + 1;
                        for (int i123 = i122; i123 < i59; i123++) {
                            int i124 = (((byte) (bArr[i76][i4] ^ bArr[i123][i4])) >> i3) & 1;
                            for (int i125 = 0; i125 < i32; i125++) {
                                byte[] bArr12 = bArr[i76];
                                bArr12[i125] = (byte) ((bArr[i123][i125] & (-i124)) ^ bArr12[i125]);
                            }
                        }
                        if (((bArr[i76][i4] >> i3) & 1) == 0) {
                            break;
                        }
                        for (int i126 = 0; i126 < i59; i126++) {
                            if (i126 != i76) {
                                int i127 = (bArr[i126][i4] >> i3) & 1;
                                for (int i128 = 0; i128 < i32; i128++) {
                                    byte[] bArr13 = bArr[i126];
                                    bArr13[i128] = (byte) ((bArr[i76][i128] & (-i127)) ^ bArr13[i128]);
                                }
                            }
                        }
                        i76 = i122;
                        i30 = i2;
                        bArr8 = bArr;
                        i62 = i4;
                        i31 = 8;
                    } else {
                        int i129 = i30;
                        byte[][] bArr14 = bArr8;
                        if (zqoVar.h) {
                            int i130 = i59 & 7;
                            if (i130 == 0) {
                                System.arraycopy(bArr14[i62], (i59 - 1) >> 3, bArr6, 0, i32);
                            } else {
                                int i131 = 0;
                                int i132 = 0;
                                while (i131 < i59) {
                                    int i133 = (i59 - 1) >> 3;
                                    while (true) {
                                        i = i132 + 1;
                                        if (i133 < i32 - 1) {
                                            byte[] bArr15 = bArr14[i131];
                                            int i134 = (bArr15[i133] & 255) >>> i130;
                                            i133++;
                                            bArr6[i132] = (byte) ((bArr15[i133] << (8 - i130)) | i134);
                                            i132 = i;
                                        }
                                    }
                                    bArr6[i132] = (byte) ((bArr14[i131][i133] & 255) >>> i130);
                                    i131++;
                                    i132 = i;
                                }
                            }
                        } else {
                            int i135 = ((i129 - i59) + 7) >> 3;
                            for (int i136 = 0; i136 < i59; i136++) {
                                System.arraycopy(bArr14[i136], i59 >> 3, bArr6, i135 * i136, i135);
                            }
                        }
                    }
                }
            } else {
                if ((jArr4[i50 - 1] >> 31) == (jArr4[i50] >> 31)) {
                    break;
                }
                i50++;
            }
        }
        zpu zpuVar = new zpu(bArr4);
        byte[] bArrBh = bh(bArr5, 0, 32);
        byte[] bArrBh2 = bh(bArr5, 32, 40);
        int i137 = zqqVar4.l;
        int i138 = i137 + i137 + 40;
        byte[] bArrBh3 = bh(bArr5, 40, i138);
        int length2 = bArr5.length;
        int i139 = length2 - 32;
        return new zlq(zmdVar6, new zpt(bArrBh, bArrBh2, bArrBh3, bh(bArr5, i138, i139), bh(bArr5, i139, length2), zpuVar), zjoVar);
    }

    public static zod bJ(zlq zlqVar) throws IOException {
        if (zlqVar == null) {
            throw new IllegalArgumentException("keyInfo array null");
        }
        zmd zmdVar = zlqVar.a;
        zjb zjbVar = zmdVar.a;
        if (zjbVar.n(zqa.h)) {
            return new zxd(zun.a(zmdVar), zjd.f(zlqVar.a()).b);
        }
        if (zjbVar.w(zqa.d)) {
            return new zth(zjd.f(zlqVar.a()).b, zun.c(zqb.a(zmdVar.b)));
        }
        int i = 0;
        int i2 = 1;
        if (zjbVar.w(zqa.e)) {
            byte[] bArr = zjd.f(zlqVar.a()).b;
            int length = bArr.length >> 1;
            short[] sArr = new short[length];
            while (i != length) {
                sArr[i] = aT(bArr, i + i);
                i++;
            }
            return new zse(sArr);
        }
        if (zjbVar.w(zlp.C)) {
            byte[] bArr2 = zjd.f(zlqVar.a()).b;
            zic zicVar = zlqVar.c;
            if (aQ(bArr2, 0) != 1) {
                if (zicVar == null) {
                    return zrt.a(bh(bArr2, 4, bArr2.length));
                }
                byte[] bArrN = zicVar.n();
                zrt zrtVarA = zrt.a(bh(bArr2, 4, bArr2.length));
                zrtVarA.c = zru.a(bArrN);
                return zrtVarA;
            }
            if (zicVar == null) {
                return zrz.a(bh(bArr2, 4, bArr2.length));
            }
            byte[] bArrN2 = zicVar.n();
            byte[] bArrBh = bh(bArr2, 4, bArr2.length);
            byte[] bArrBh2 = bh(bArrN2, 4, bArrN2.length);
            zrz zrzVarA = zrz.a(bArrBh);
            zrzVarA.b = zsa.a(bArrBh2);
            return zrzVarA;
        }
        if (zjbVar.n(zlk.n) || zjbVar.n(zlk.Y)) {
            ztn ztnVarJ = zun.J(zjbVar);
            zih zihVarA = zlqVar.a();
            if (!(zihVarA instanceof zjm)) {
                return new zto(ztnVarJ, zjd.f(zihVarA).b);
            }
            zqc zqcVar = zihVarA != null ? new zqc(zjm.j(zihVarA)) : null;
            zqd zqdVar = zqcVar.c;
            return new zto(ztnVarJ, bd(zqcVar.a), bd(zqcVar.b), zqdVar.b(), zqdVar.a());
        }
        if (zjbVar.n(zlk.al)) {
            return new zsu(zun.G(zjbVar), zjd.f(zlqVar.a()).b);
        }
        if (zjbVar.n(zlk.aT)) {
            zih zihVarA2 = zlqVar.a();
            zpt zptVar = zihVarA2 != null ? new zpt(zjm.j(zihVarA2)) : null;
            return new zqr(zun.x(zjbVar), bd(zptVar.a), bd(zptVar.b), bd(zptVar.c), bd(zptVar.d), bd(zptVar.e));
        }
        if (zjbVar.n(zlk.be)) {
            return new zrm(zun.B(zjbVar), zjd.f(zlqVar.a()).b);
        }
        if (zjbVar.n(zlk.bl)) {
            return new zte(zun.I(zjbVar), zjd.f(zlqVar.a()).b);
        }
        if (zjbVar.n(zlk.bF)) {
            return new zsi(zun.D(zjbVar), zjd.f(zlqVar.a()).b);
        }
        if (zjbVar.n(zlk.bM)) {
            return new zre(zun.z(zjbVar), zjd.f(zlqVar.a()).b);
        }
        if (zjbVar.n(zlk.bU)) {
            zjm zjmVarJ = zjm.j(zlqVar.a());
            return new zsm(zun.E(zjbVar), zjd.f(zjmVarJ.h(0)).b, zjd.f(zjmVarJ.h(1)).b, zjd.f(zjmVarJ.h(2)).b, zjd.f(zjmVarJ.h(3)).b);
        }
        if (zjbVar.n(zlk.cb)) {
            zjm zjmVarJ2 = zjm.j(zlqVar.a());
            return new zsq(zun.F(zjbVar), zjd.f(zjmVarJ2.h(0)).b, zjd.f(zjmVarJ2.h(1)).b, zjd.f(zjmVarJ2.h(2)).b, zjd.f(zjmVarJ2.h(3)).b, zjd.f(zjmVarJ2.h(4)).b);
        }
        if (zjbVar.w(zlk.aC) || zjbVar.w(zlk.aD) || zjbVar.w(zlk.aE)) {
            zih zihVarA3 = zlqVar.a();
            zqy zqyVarY = zun.y(zjbVar);
            if (!(zihVarA3 instanceof zjm)) {
                if (!(zihVarA3 instanceof zkn)) {
                    throw new IOException("not supported");
                }
                byte[] bArr3 = zjd.f(zihVarA3).b;
                zic zicVar2 = zlqVar.c;
                return zicVar2 != null ? new zqz(zqyVarY, bArr3, zts.b(zqyVarY, zicVar2)) : new zqz(zqyVarY, bArr3, null);
            }
            zjm zjmVarJ3 = zjm.j(zihVarA3);
            int iF = ziu.m(zjmVarJ3.h(0)).f();
            if (iF != 0) {
                throw new IOException(a.cf(iF, "unknown private key version: "));
            }
            zic zicVar3 = zlqVar.c;
            return zicVar3 != null ? new zqz(zqyVarY, zic.i(zjmVarJ3.h(1)).n(), zic.i(zjmVarJ3.h(2)).n(), zic.i(zjmVarJ3.h(3)).n(), zic.i(zjmVarJ3.h(4)).n(), zic.i(zjmVarJ3.h(5)).n(), zic.i(zjmVarJ3.h(6)).n(), zts.b(zqyVarY, zicVar3).b()) : new zqz(zqyVarY, zic.i(zjmVarJ3.h(1)).n(), zic.i(zjmVarJ3.h(2)).n(), zic.i(zjmVarJ3.h(3)).n(), zic.i(zjmVarJ3.h(4)).n(), zic.i(zjmVarJ3.h(5)).n(), zic.i(zjmVarJ3.h(6)).n(), null);
        }
        if (zjbVar.w(zlk.aA) || zjbVar.w(zlk.aB)) {
            zih zihVarA4 = zlqVar.a();
            zpv zpvVar = zihVarA4 != null ? new zpv(zjm.j(zihVarA4)) : null;
            return new zri(zun.A(zjbVar), bd(zpvVar.a), bd(zpvVar.b), bd(zpvVar.c), zpvVar.d.a);
        }
        if (zjbVar.n(zlk.ci)) {
            byte[] bArr4 = zjd.f(zlqVar.a()).b;
            zql zqlVarW = zun.w(zjbVar);
            byte[] bArrBh3 = bh(bArr4, 0, zqlVarW.a());
            int iA = zqlVarW.a();
            int iA2 = zqlVarW.a();
            byte[] bArrBh4 = bh(bArr4, iA, iA2 + iA2);
            int iA3 = zqlVarW.a();
            return new zqm(zqlVarW, bArrBh3, bArrBh4, bh(bArr4, iA3 + iA3, bArr4.length));
        }
        if (zjbVar.n(zlk.cm)) {
            return new zrq(zun.C(zjbVar), zjd.f(zlqVar.a()).b);
        }
        if (zjbVar.n(zlk.aI)) {
            return new zta(zun.H(zjbVar), zjd.f(zlqVar.a()).b);
        }
        if (zjbVar.w(zqa.f)) {
            zqe zqeVarA = zqe.a(zmdVar.b);
            zjb zjbVar2 = zqeVarA.b.a;
            zih zihVarA5 = zlqVar.a();
            zqi zqiVar = zihVarA5 != null ? new zqi(zjm.j(zihVarA5)) : null;
            try {
                zvo zvoVar = new zvo(new zvn(zqeVarA.a, zun.v(zjbVar2)));
                zvoVar.b = zqiVar.b;
                zvoVar.d = bz(bd(zqiVar.c));
                zvoVar.e = bz(bd(zqiVar.d));
                zvoVar.f = bz(bd(zqiVar.e));
                zvoVar.g = bz(bd(zqiVar.f));
                if (zqiVar.a != 0) {
                    zvoVar.c = zqiVar.g;
                }
                if (zqiVar.a() != null) {
                    zvoVar.h = new zuo((zuo) bv(zqiVar.a(), zuo.class), zjbVar2);
                }
                return new zvp(zvoVar);
            } catch (ClassNotFoundException e) {
                throw new IOException("ClassNotFoundException processing BDS state: ".concat(String.valueOf(e.getMessage())));
            }
        }
        if (zjbVar.w(zqa.g)) {
            zqf zqfVarA = zqf.a(zmdVar.b);
            zjb zjbVar3 = zqfVarA.c.a;
            try {
                zih zihVarA6 = zlqVar.a();
                zqg zqgVar = zihVarA6 != null ? new zqg(zjm.j(zihVarA6)) : null;
                zvi zviVar = new zvi(new zvh(zqfVarA.a, zqfVarA.b, zun.v(zjbVar3)));
                zviVar.b = zqgVar.b;
                zviVar.d = bz(bd(zqgVar.d));
                zviVar.e = bz(bd(zqgVar.e));
                zviVar.f = bz(bd(zqgVar.f));
                zviVar.g = bz(bd(zqgVar.g));
                if (zqgVar.a != 0) {
                    zviVar.c = zqgVar.c;
                }
                if (zqgVar.a() != null) {
                    zup zupVar = (zup) bv(zqgVar.a(), zup.class);
                    zup zupVar2 = new zup(zupVar.b);
                    Map map = zupVar.a;
                    for (Integer num : map.keySet()) {
                        zupVar2.a.put(num, new zuo((zuo) map.get(num), zjbVar3));
                    }
                    if (zupVar2.b == 0) {
                        zviVar.h = new zup(zupVar2, (1 << zviVar.a.d) - 1);
                    } else {
                        zviVar.h = zupVar2;
                    }
                }
                return new zvj(zviVar);
            } catch (ClassNotFoundException e2) {
                throw new IOException("ClassNotFoundException processing BDS state: ".concat(String.valueOf(e2.getMessage())));
            }
        }
        if (!zjbVar.w(zqa.c)) {
            throw new RuntimeException("algorithm identifier in private key not recognised");
        }
        zih zihVarA7 = zlqVar.a();
        zpy zpyVar = zihVarA7 != null ? new zpy(zjm.j(zihVarA7)) : null;
        int i3 = zpyVar.a;
        int i4 = zpyVar.b;
        zxf zxfVarA = zpyVar.a();
        zxj zxjVar = new zxj(zpyVar.a(), zpyVar.c);
        zxi zxiVar = new zxi(zpyVar.d);
        String strB = zun.b(zpyVar.e.a);
        int i5 = zxfVarA.a;
        int i6 = 1 << i5;
        int iC = zxjVar.c();
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iC, i6);
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iC, i6);
        int i7 = 0;
        while (i7 < i6) {
            int[] iArr3 = iArr2[i];
            int[] iArr4 = zxjVar.c;
            int i8 = i2;
            int i9 = zxjVar.b;
            int iB = iArr4[i9];
            int i10 = i9 - 1;
            while (i10 >= 0) {
                iB = zxjVar.c[i10] ^ zxjVar.a.b(iB, i7);
                i10--;
                i = i;
            }
            iArr3[i7] = zxfVarA.a(iB);
            i7++;
            i2 = i8;
            i = i;
        }
        int i11 = i;
        int i12 = i2;
        for (int i13 = i12; i13 < iC; i13++) {
            for (int i14 = i11; i14 < i6; i14++) {
                iArr2[i13][i14] = zxfVarA.b(iArr2[i13 - 1][i14], i14);
            }
        }
        for (int i15 = i11; i15 < iC; i15++) {
            for (int i16 = i11; i16 < i6; i16++) {
                int i17 = i11;
                while (i17 <= i15) {
                    int[] iArr5 = iArr[i15];
                    iArr5[i16] = iArr5[i16] ^ zxfVarA.b(iArr2[i17][i16], zxjVar.b((iC + i17) - i15));
                    i17++;
                    zxiVar = zxiVar;
                }
            }
        }
        zxi zxiVar2 = zxiVar;
        int[] iArr6 = new int[2];
        iArr6[i12] = (i6 + 31) >>> 5;
        iArr6[i11] = iC * i5;
        int[][] iArr7 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iArr6);
        for (int i18 = i11; i18 < i6; i18++) {
            int i19 = i18 >>> 5;
            int i20 = i12 << (i18 & 31);
            int i21 = i11;
            while (i21 < iC) {
                int i22 = i21 + 1;
                int i23 = iArr[i21][i18];
                for (int i24 = i11; i24 < i5; i24++) {
                    if (((i23 >>> i24) & 1) != 0) {
                        int[] iArr8 = iArr7[((i22 * i5) - i24) - 1];
                        iArr8[i19] = iArr8[i19] ^ i20;
                    }
                }
                i21 = i22;
            }
        }
        new zxh(i6, iArr7);
        return new zxb(i3, i4, zxfVarA, zxjVar, zxiVar2, strB);
    }

    private static int bK(byte b2) {
        return b2 & 63;
    }

    private static boolean bL(byte b2) {
        return b2 > -65;
    }

    private static final int bM(int i) {
        int iBinarySearch = Arrays.binarySearch(vvx.a, i);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }

    public static int ba(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ bArr[length];
        }
    }

    public static int bb(int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ iArr[length];
        }
    }

    public static boolean bc(Object[] objArr) {
        if (objArr == null) {
            return true;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

    public static byte[] bd(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public static byte[] be(byte[][] bArr) {
        int length = 0;
        for (int i = 0; i != bArr.length; i++) {
            length += bArr[i].length;
        }
        byte[] bArr2 = new byte[length];
        int length2 = 0;
        for (int i2 = 0; i2 != bArr.length; i2++) {
            byte[] bArr3 = bArr[i2];
            System.arraycopy(bArr3, 0, bArr2, length2, bArr3.length);
            length2 += bArr[i2].length;
        }
        return bArr2;
    }

    public static byte[] bf(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bd(bArr2);
        }
        if (bArr2 == null) {
            return bd(bArr);
        }
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length + length2];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        System.arraycopy(bArr2, 0, bArr3, length, length2);
        return bArr3;
    }

    public static byte[] bg(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
        return bArr2;
    }

    public static byte[] bh(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        if (i3 >= 0) {
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i, bArr2, 0, Math.min(bArr.length - i, i3));
            return bArr2;
        }
        throw new IllegalArgumentException(i + " > " + i2);
    }

    public static short[] bi(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        return (short[]) sArr.clone();
    }

    public static int bj(int i) {
        int i2 = -1;
        while (i != 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    public static int bk(int i, int i2, int i3) {
        int iBl = bl(i, i3);
        int iBl2 = bl(i2, i3);
        int i4 = 0;
        if (iBl2 != 0) {
            int iBj = bj(i3);
            while (iBl != 0) {
                if ((iBl & 1) == 1) {
                    i4 ^= iBl2;
                }
                iBl >>>= 1;
                iBl2 += iBl2;
                if (iBl2 >= (1 << iBj)) {
                    iBl2 ^= i3;
                }
            }
        }
        return i4;
    }

    public static int bl(int i, int i2) {
        if (i2 == 0) {
            System.err.println("Error: to be divided by 0");
            return 0;
        }
        while (bj(i) >= bj(i2)) {
            i ^= i2 << (bj(i) - bj(i2));
        }
        return i;
    }

    public static int bm(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static void bn(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
    }

    public static boolean bo(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        if (length != iArr2.length) {
            return false;
        }
        boolean z = true;
        for (int i = length - 1; i >= 0; i--) {
            z &= iArr[i] == iArr2[i];
        }
        return z;
    }

    public static int[] bp(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    public static zjb bq(String str) {
        if (str.equals("SHA-256")) {
            return zln.c;
        }
        if (str.equals("SHA-512")) {
            return zln.e;
        }
        if (str.equals("SHAKE128")) {
            return zln.m;
        }
        if (str.equals("SHAKE256")) {
            return zln.n;
        }
        throw new IllegalArgumentException("unrecognized digest: ".concat(str));
    }

    public static byte[] br(zod zodVar, zjo zjoVar) {
        if (!zodVar.a) {
            throw new IllegalArgumentException("public key found");
        }
        try {
            return bI(zodVar, zjoVar).u();
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] bs(zod zodVar) {
        if (zodVar.a) {
            throw new IllegalArgumentException("private key found");
        }
        try {
            return bH(zodVar).u();
        } catch (Exception unused) {
            return null;
        }
    }

    public static int bt(long j, int i) {
        return (int) (j & ((1 << i) - 1));
    }

    public static int bu(int i) {
        int i2 = 0;
        while (true) {
            i >>= 1;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    public static Object bv(byte[] bArr, Class cls) throws ClassNotFoundException, IOException {
        zvs zvsVar = new zvs(cls, new ByteArrayInputStream(bArr));
        Object object = zvsVar.readObject();
        if (zvsVar.available() != 0) {
            throw new IOException("unexpected data found at end of ObjectInputStream");
        }
        if (cls.isInstance(object)) {
            return object;
        }
        throw new IOException("unexpected class found in ObjectInputStream");
    }

    public static void bw(byte[] bArr, byte[] bArr2, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        }
        if (bArr2.length + i > bArr.length) {
            throw new IllegalArgumentException("src length + offset must not be greater than size of destination");
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            bArr[i + i2] = bArr2[i2];
        }
    }

    public static boolean bx(byte[][] bArr) {
        for (byte[] bArr2 : bArr) {
            if (bArr2 == null) {
                return true;
            }
        }
        return false;
    }

    public static boolean by(int i, long j) {
        if (j >= 0) {
            return j < (1 << i);
        }
        throw new IllegalStateException("index must not be negative");
    }

    public static byte[] bz(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("in == null");
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public static Duration c(vtl vtlVar) {
        return Duration.ofSeconds(vxd.f(vtlVar.b, vtlVar.c).b, r4.c);
    }

    public static Instant d(vwe vweVar) {
        return Instant.ofEpochSecond(vxf.f(vweVar.b, vweVar.c).b, r4.c);
    }

    public static /* synthetic */ String e(int i) {
        return i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? "UNRECOGNIZED" : "FORMAT_UHD1" : "FORMAT_HD" : "FORMAT_SD" : "FORMAT_AUDIO" : "FORMAT_UNSPECIFIED";
    }

    public static final /* synthetic */ vyw f(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (vyw) vucVarO;
    }

    public static vvj g(Parcel parcel, vvj vvjVar, vtp vtpVar) {
        return h((ProtoParsers$InternalDontUse) parcel.readTypedObject(ProtoParsers$InternalDontUse.CREATOR), vvjVar, vtpVar);
    }

    public static vvj h(ProtoParsers$InternalDontUse protoParsers$InternalDontUse, vvj vvjVar, vtp vtpVar) {
        vvj vvjVarT = vvjVar.t();
        if (protoParsers$InternalDontUse.b == null) {
            protoParsers$InternalDontUse.b = vvjVarT.dZ().g(protoParsers$InternalDontUse.a, vtpVar).r();
        }
        return protoParsers$InternalDontUse.b;
    }

    public static vvj i(Bundle bundle, String str, vvj vvjVar, vtp vtpVar) {
        ProtoParsers$InternalDontUse protoParsers$InternalDontUse;
        Parcelable parcelable = bundle.getParcelable(str);
        if (parcelable instanceof Bundle) {
            Bundle bundle2 = (Bundle) parcelable;
            bundle2.setClassLoader(ProtoParsers$InternalDontUse.class.getClassLoader());
            protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) bundle2.getParcelable("protoparsers");
        } else {
            protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) parcelable;
        }
        return h(protoParsers$InternalDontUse, vvjVar, vtpVar);
    }

    public static vvj j(byte[] bArr, vvj vvjVar) {
        try {
            return vvjVar.dZ().f(bArr).r();
        } catch (vuq e) {
            throw new RuntimeException(e);
        }
    }

    public static void k(Parcel parcel, vvj vvjVar) {
        parcel.writeTypedObject(new ProtoParsers$InternalDontUse(null, vvjVar), 0);
    }

    public static void l(Intent intent, String str, vvj vvjVar) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("protoparsers", new ProtoParsers$InternalDontUse(null, vvjVar));
        intent.putExtra(str, bundle);
    }

    public static final String m(ByteBuffer byteBuffer, int i, int i2) throws vuq {
        int i3;
        if ((((byteBuffer.limit() - i) - i2) | i | i2) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i4 = i + i2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (i < i4) {
            byte b2 = byteBuffer.get(i);
            if (!s(b2)) {
                break;
            }
            i++;
            p(b2, cArr, i5);
            i5++;
        }
        int i6 = i5;
        while (i < i4) {
            int i7 = i + 1;
            byte b3 = byteBuffer.get(i);
            if (s(b3)) {
                p(b3, cArr, i6);
                i6++;
                i = i7;
                while (i < i4) {
                    byte b4 = byteBuffer.get(i);
                    if (s(b4)) {
                        i++;
                        p(b4, cArr, i6);
                        i6++;
                    }
                }
            } else {
                if (u(b3)) {
                    if (i7 >= i4) {
                        throw new vuq("Protocol message had invalid UTF-8.");
                    }
                    i3 = i6 + 1;
                    i += 2;
                    r(b3, byteBuffer.get(i7), cArr, i6);
                } else if (t(b3)) {
                    if (i7 >= i4 - 1) {
                        throw new vuq("Protocol message had invalid UTF-8.");
                    }
                    i3 = i6 + 1;
                    int i8 = i + 2;
                    i += 3;
                    q(b3, byteBuffer.get(i7), byteBuffer.get(i8), cArr, i6);
                } else {
                    if (i7 >= i4 - 2) {
                        throw new vuq("Protocol message had invalid UTF-8.");
                    }
                    byte b5 = byteBuffer.get(i7);
                    int i9 = i + 3;
                    byte b6 = byteBuffer.get(i + 2);
                    i += 4;
                    o(b3, b5, b6, byteBuffer.get(i9), cArr, i6);
                    i6 += 2;
                }
                i6 = i3;
            }
        }
        return new String(cArr, 0, i6);
    }

    public static String n(byte[] bArr, int i, int i2) throws vuq {
        int i3;
        int length = bArr.length;
        if ((((length - i) - i2) | i | i2) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i4 = i + i2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (i < i4) {
            byte b2 = bArr[i];
            if (!s(b2)) {
                break;
            }
            i++;
            p(b2, cArr, i5);
            i5++;
        }
        int i6 = i5;
        while (i < i4) {
            int i7 = i + 1;
            byte b3 = bArr[i];
            if (s(b3)) {
                p(b3, cArr, i6);
                i6++;
                i = i7;
                while (i < i4) {
                    byte b4 = bArr[i];
                    if (s(b4)) {
                        i++;
                        p(b4, cArr, i6);
                        i6++;
                    }
                }
            } else {
                if (u(b3)) {
                    if (i7 >= i4) {
                        throw new vuq("Protocol message had invalid UTF-8.");
                    }
                    i3 = i6 + 1;
                    i += 2;
                    r(b3, bArr[i7], cArr, i6);
                } else if (t(b3)) {
                    if (i7 >= i4 - 1) {
                        throw new vuq("Protocol message had invalid UTF-8.");
                    }
                    i3 = i6 + 1;
                    int i8 = i + 2;
                    i += 3;
                    q(b3, bArr[i7], bArr[i8], cArr, i6);
                } else {
                    if (i7 >= i4 - 2) {
                        throw new vuq("Protocol message had invalid UTF-8.");
                    }
                    byte b5 = bArr[i7];
                    int i9 = i + 3;
                    byte b6 = bArr[i + 2];
                    i += 4;
                    o(b3, b5, b6, bArr[i9], cArr, i6);
                    i6 += 2;
                }
                i6 = i3;
            }
        }
        return new String(cArr, 0, i6);
    }

    public static void o(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i) throws vuq {
        if (bL(b3) || (((b2 << 28) + (b3 + 112)) >> 30) != 0 || bL(b4) || bL(b5)) {
            throw new vuq("Protocol message had invalid UTF-8.");
        }
        int iBK = ((b2 & 7) << 18) | (bK(b3) << 12) | (bK(b4) << 6) | bK(b5);
        cArr[i] = (char) ((iBK >>> 10) + 55232);
        cArr[i + 1] = (char) ((iBK & 1023) + 56320);
    }

    public static void p(byte b2, char[] cArr, int i) {
        cArr[i] = (char) b2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0016 A[PHI: r2
  0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void q(byte r2, byte r3, byte r4, char[] r5, int r6) throws defpackage.vuq {
        /*
            boolean r0 = bL(r3)
            if (r0 != 0) goto L30
            r0 = -96
            r1 = -32
            if (r2 != r1) goto Lf
            if (r3 < r0) goto L30
            r2 = r1
        Lf:
            r1 = -19
            if (r2 != r1) goto L16
            if (r3 >= r0) goto L30
            r2 = r1
        L16:
            boolean r0 = bL(r4)
            if (r0 != 0) goto L30
            r2 = r2 & 15
            int r3 = bK(r3)
            int r4 = bK(r4)
            int r2 = r2 << 12
            int r3 = r3 << 6
            r2 = r2 | r3
            r2 = r2 | r4
            char r2 = (char) r2
            r5[r6] = r2
            return
        L30:
            vuq r2 = new vuq
            java.lang.String r3 = "Protocol message had invalid UTF-8."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vxr.q(byte, byte, byte, char[], int):void");
    }

    public static void r(byte b2, byte b3, char[] cArr, int i) throws vuq {
        if (b2 < -62 || bL(b3)) {
            throw new vuq("Protocol message had invalid UTF-8.");
        }
        cArr[i] = (char) (((b2 & 31) << 6) | bK(b3));
    }

    public static boolean s(byte b2) {
        return b2 >= 0;
    }

    public static boolean t(byte b2) {
        return b2 < -16;
    }

    public static boolean u(byte b2) {
        return b2 < -32;
    }

    public static String v(vsz vszVar) {
        StringBuilder sb = new StringBuilder(vszVar.d());
        for (int i = 0; i < vszVar.d(); i++) {
            byte bA = vszVar.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                            break;
                        } else {
                            sb.append((char) bA);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final /* synthetic */ wpm w(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (wpm) vucVarO;
    }

    public static final void x(wld wldVar, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wpm wpmVar = (wpm) vtwVar.b;
        wpm wpmVar2 = wpm.a;
        wpmVar.e = wldVar;
        wpmVar.b |= 1;
    }

    public static final void y(wpl wplVar, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wpm wpmVar = (wpm) vtwVar.b;
        wpm wpmVar2 = wpm.a;
        wpmVar.g = wplVar;
        wpmVar.b |= 4;
    }

    public static final void z(woz wozVar, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wpm wpmVar = (wpm) vtwVar.b;
        wpm wpmVar2 = wpm.a;
        wpmVar.d = wozVar;
        wpmVar.c = 4;
    }

    public vxr(byte[] bArr, byte[] bArr2) {
        new HashMap();
        new HashMap();
    }

    public vxr(byte[] bArr, char[] cArr, byte[] bArr2) {
        new znw();
        new znz();
        byte[] bArr3 = zoc.a;
        znn.a();
    }

    public vxr(char[] cArr, byte[] bArr, byte[] bArr2) {
        new zoa(128);
        new zny(256);
        new zny(512);
    }
}
