package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import javax.crypto.KeyGenerator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaag {
    public zzv f;
    public Context a = null;
    public String b = null;
    public String c = null;
    public String d = null;
    private zzj g = null;
    public zzp e = null;

    private final zzj b() throws KeyStoreException {
        boolean z;
        Object obj = aaah.a;
        aaal aaalVar = new aaal();
        try {
            String str = this.d;
            synchronized (aaal.a) {
                String strA = aagd.a(str);
                if (aaaj.a().containsAlias(strA)) {
                    z = false;
                } else {
                    KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(strA, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build();
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    keyGenerator.init(keyGenParameterSpecBuild);
                    keyGenerator.generateKey();
                    z = true;
                }
            }
            try {
                return aaalVar.a(this.d);
            } catch (GeneralSecurityException | ProviderException e) {
                if (!z) {
                    throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.d), e);
                }
                Log.w(aaah.b, "cannot use Android Keystore, it'll be disabled", e);
                return null;
            }
        } catch (GeneralSecurityException | ProviderException e2) {
            Log.w(aaah.b, "cannot use Android Keystore, it'll be disabled", e2);
            return null;
        }
    }

    private final zzv c(byte[] bArr) {
        return zzv.b(zzl.a(zzk.a(bArr)));
    }

    private final zzv d(byte[] bArr) throws GeneralSecurityException, IOException {
        try {
            this.g = new aaal().a(this.d);
            try {
                byte[] bArr2 = new byte[0];
                zzk zzkVarA = zzk.a(bArr);
                zzj zzjVar = this.g;
                try {
                    InputStream inputStream = zzkVarA.a;
                    ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.a;
                    abza abzaVar = abza.a;
                    ExtensionRegistryLite extensionRegistryLite2 = ExtensionRegistryLite.a;
                    aact aactVar = aact.a;
                    abvt abvtVarK = abvt.K(inputStream, 4096);
                    aact aactVar2 = new aact();
                    try {
                        try {
                            try {
                                try {
                                    abzj abzjVarA = abza.a.a(aactVar2.getClass());
                                    abzjVarA.i(aactVar2, abvu.p(abvtVarK), extensionRegistryLite2);
                                    abzjVarA.g(aactVar2);
                                    Byte b = (byte) 1;
                                    b.getClass();
                                    zzkVarA.a.close();
                                    if (aactVar2.c.d() == 0) {
                                        throw new GeneralSecurityException("empty keyset");
                                    }
                                    try {
                                        byte[] bArrA = zzjVar.a(aactVar2.c.B(), bArr2);
                                        abxd abxdVarH = abxd.h(aade.a, bArrA, 0, bArrA.length, ExtensionRegistryLite.a);
                                        if (abxdVarH != null) {
                                            abxd abxdVar = null;
                                            byte bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue();
                                            if (bByteValue != 1) {
                                                if (bByteValue != 0) {
                                                    boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                                                    if (true == zL) {
                                                        abxdVar = abxdVarH;
                                                    }
                                                    abxdVarH.cM(2, abxdVar);
                                                    if (zL) {
                                                    }
                                                }
                                                throw new abzz().a();
                                            }
                                        }
                                        aade aadeVar = (aade) abxdVarH;
                                        zzu.d(aadeVar);
                                        return zzv.b(zzu.b(aadeVar));
                                    } catch (abxv unused) {
                                        throw new GeneralSecurityException("invalid keyset, corrupted key material");
                                    }
                                } catch (abxv e) {
                                    if (e.a) {
                                        throw new abxv(e);
                                    }
                                    throw e;
                                }
                            } catch (IOException e2) {
                                if (e2.getCause() instanceof abxv) {
                                    throw ((abxv) e2.getCause());
                                }
                                throw new abxv(e2);
                            }
                        } catch (RuntimeException e3) {
                            if (e3.getCause() instanceof abxv) {
                                throw ((abxv) e3.getCause());
                            }
                            throw e3;
                        }
                    } catch (abzz e4) {
                        throw e4.a();
                    }
                } catch (Throwable th) {
                    zzkVarA.a.close();
                    throw th;
                }
            } catch (IOException | GeneralSecurityException e5) {
                try {
                    return c(bArr);
                } catch (IOException unused2) {
                    throw e5;
                }
            }
        } catch (GeneralSecurityException | ProviderException e6) {
            try {
                zzv zzvVarC = c(bArr);
                Log.w(aaah.b, "cannot use Android Keystore, it'll be disabled", e6);
                return zzvVarC;
            } catch (IOException unused3) {
                throw e6;
            }
        }
    }

    public final synchronized aaah a() {
        int i;
        byte[] bArr;
        aaah aaahVar;
        int i2;
        SharedPreferences.Editor editorEdit;
        int iA;
        int iA2;
        int iA3;
        char c;
        int i3;
        if (this.b == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        synchronized (aaah.a) {
            Context context = this.a;
            String str = this.b;
            String str2 = this.c;
            if (str == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            Context applicationContext = context.getApplicationContext();
            int i4 = 0;
            SharedPreferences defaultSharedPreferences = str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0);
            Integer num = null;
            char c2 = 1;
            try {
                String string = defaultSharedPreferences.getString(str, null);
                char c3 = 2;
                char c4 = 16;
                if (string == null) {
                    bArr = null;
                } else {
                    if (string.length() % 2 != 0) {
                        i = 1;
                        try {
                            throw new IllegalArgumentException("Expected a string of even length");
                        } catch (ClassCastException | IllegalArgumentException unused) {
                            Object[] objArr = new Object[i];
                            objArr[0] = str;
                            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", objArr));
                        }
                    }
                    int length = string.length() / 2;
                    bArr = new byte[length];
                    for (int i5 = 0; i5 < length; i5++) {
                        int i6 = i5 + i5;
                        int iDigit = Character.digit(string.charAt(i6), 16);
                        int iDigit2 = Character.digit(string.charAt(i6 + 1), 16);
                        if (iDigit == -1 || iDigit2 == -1) {
                            throw new IllegalArgumentException("input is not hexadecimal");
                        }
                        bArr[i5] = (byte) ((iDigit * 16) + iDigit2);
                    }
                }
                if (bArr == null) {
                    if (this.d != null) {
                        this.g = b();
                    }
                    zzp zzpVar = this.e;
                    if (zzpVar == null) {
                        throw new GeneralSecurityException("cannot read or generate keyset");
                    }
                    zzw zzwVar = zzpVar.a;
                    zzs zzsVar = new zzs();
                    zzq zzqVar = new zzq(zzwVar);
                    zzr zzrVar = zzr.a;
                    zzqVar.e = zzrVar;
                    zzs zzsVar2 = zzqVar.f;
                    if (zzsVar2 != null) {
                        zzsVar2.a();
                    }
                    zzqVar.a = true;
                    if (zzqVar.f != null) {
                        throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
                    }
                    zzsVar.a();
                    zzqVar.f = zzsVar;
                    List<zzq> list = zzsVar.a;
                    list.add(zzqVar);
                    if (zzsVar.c) {
                        throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
                    }
                    zzsVar.c = true;
                    aade aadeVar = aade.a;
                    aadb aadbVar = new aadb();
                    ArrayList arrayList = new ArrayList(list.size());
                    int i7 = 0;
                    while (i7 < list.size() - 1) {
                        int i8 = i7 + 1;
                        if (((zzq) list.get(i7)).e == zzrVar && ((zzq) list.get(i8)).e != zzrVar) {
                            throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                        }
                        i7 = i8;
                    }
                    HashSet hashSet = new HashSet();
                    Integer num2 = null;
                    for (zzq zzqVar2 : list) {
                        zzo zzoVar = zzqVar2.b;
                        char c5 = c3;
                        zzr zzrVar2 = zzqVar2.e;
                        if (zzrVar2 == null) {
                            throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
                        }
                        int i9 = 3;
                        if (zzrVar2 == zzrVar) {
                            i3 = i4;
                            while (true) {
                                if (i3 != 0) {
                                    c = c4;
                                    if (!hashSet.contains(Integer.valueOf(i3))) {
                                        break;
                                    }
                                } else {
                                    c = c4;
                                }
                                int i10 = aacj.a;
                                i3 = i4;
                                while (i3 == 0) {
                                    byte[] bArrB = aacb.b(4);
                                    i3 = (bArrB[3] & 255) | ((bArrB[c5] & 255) << 8) | ((bArrB[i4] & 255) << 24) | ((bArrB[c2] & 255) << 16);
                                    c2 = c2;
                                }
                                c4 = c;
                            }
                        } else {
                            c = c4;
                            i3 = i4;
                        }
                        char c6 = c2;
                        Integer numValueOf = Integer.valueOf(i3);
                        if (hashSet.contains(numValueOf)) {
                            throw new GeneralSecurityException(a.a(i3, "Id ", " is used twice in the keyset"));
                        }
                        hashSet.add(numValueOf);
                        zzn zznVar = zzqVar2.c;
                        zzn zznVarA = aabe.a.a(zzqVar2.d, num);
                        zzt zztVar = new zzt(zznVarA, zzoVar, zzqVar2.a);
                        aacg aacgVar = (aacg) aabk.a.b.get();
                        HashSet hashSet2 = hashSet;
                        aacf aacfVar = new aacf(zznVarA.getClass(), aaby.class);
                        Map map = aacgVar.a;
                        if (!map.containsKey(aacfVar)) {
                            throw new GeneralSecurityException(a.t(aacfVar, "No Key serializer for ", " available"));
                        }
                        aacc aaccVarA = ((aaav) map.get(aacfVar)).a(zznVarA);
                        Integer num3 = ((aaby) aaccVarA).f;
                        if (num3 != null && num3.intValue() != i3) {
                            throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                        }
                        zzo zzoVar2 = zzo.a;
                        if (!zzoVar2.equals(zzoVar)) {
                            if (zzo.b.equals(zzoVar)) {
                                i9 = 4;
                            } else {
                                if (!zzo.c.equals(zzoVar)) {
                                    throw new IllegalStateException("Unknown key status");
                                }
                                i9 = 5;
                            }
                        }
                        aadd aaddVar = aadd.a;
                        aadc aadcVar = new aadc();
                        aacz aaczVar = aacz.a;
                        aacx aacxVar = new aacx();
                        String str3 = ((aaby) aaccVarA).a;
                        if ((aacxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            aacxVar.y();
                        }
                        aacz aaczVar2 = (aacz) aacxVar.b;
                        str3.getClass();
                        aaczVar2.b = str3;
                        abvo abvoVar = ((aaby) aaccVarA).c;
                        if ((aacxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            aacxVar.y();
                        }
                        aacz aaczVar3 = (aacz) aacxVar.b;
                        abvoVar.getClass();
                        aaczVar3.c = abvoVar;
                        aacy aacyVar = ((aaby) aaccVarA).d;
                        if ((aacxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            aacxVar.y();
                        }
                        ((aacz) aacxVar.b).d = aacyVar.a();
                        if ((aadcVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            aadcVar.y();
                        }
                        aadd aaddVar2 = (aadd) aadcVar.b;
                        aacz aaczVar4 = (aacz) aacxVar.v();
                        aaczVar4.getClass();
                        aaddVar2.c = aaczVar4;
                        aaddVar2.b |= 1;
                        if ((aadcVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            aadcVar.y();
                        }
                        ((aadd) aadcVar.b).d = aada.a(i9);
                        if ((aadcVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            aadcVar.y();
                        }
                        ((aadd) aadcVar.b).e = i3;
                        aadj aadjVar = ((aaby) aaccVarA).e;
                        if ((aadcVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            aadcVar.y();
                        }
                        ((aadd) aadcVar.b).f = aadjVar.a();
                        aadd aaddVar3 = (aadd) aadcVar.v();
                        if ((aadbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            aadbVar.y();
                        }
                        aade aadeVar2 = (aade) aadbVar.b;
                        aaddVar3.getClass();
                        abxs abxsVar = aadeVar2.c;
                        if (!abxsVar.c()) {
                            int size = abxsVar.size();
                            aadeVar2.c = abxsVar.d(size + size);
                        }
                        aadeVar2.c.add(aaddVar3);
                        if (zzqVar2.a) {
                            if (num2 != null) {
                                throw new GeneralSecurityException("Two primaries were set");
                            }
                            if (zzoVar != zzoVar2) {
                                throw new GeneralSecurityException("Primary key is not enabled");
                            }
                            num2 = numValueOf;
                        }
                        arrayList.add(zztVar);
                        c3 = c5;
                        c4 = c;
                        c2 = c6;
                        hashSet = hashSet2;
                        num = null;
                        i4 = 0;
                    }
                    if (num2 == null) {
                        throw new GeneralSecurityException("No primary was set");
                    }
                    int iIntValue = num2.intValue();
                    if ((aadbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        aadbVar.y();
                    }
                    ((aade) aadbVar.b).b = iIntValue;
                    aade aadeVar3 = (aade) aadbVar.v();
                    zzu.d(aadeVar3);
                    zzu zzuVar = new zzu(aadeVar3, arrayList);
                    Context context2 = this.a;
                    String str4 = this.b;
                    String str5 = this.c;
                    if (str4 == null) {
                        throw new IllegalArgumentException("keysetName cannot be null");
                    }
                    Context applicationContext2 = context2.getApplicationContext();
                    if (str5 == null) {
                        editorEdit = PreferenceManager.getDefaultSharedPreferences(applicationContext2).edit();
                        i2 = 0;
                    } else {
                        i2 = 0;
                        editorEdit = applicationContext2.getSharedPreferences(str5, 0).edit();
                    }
                    zzj zzjVar = this.g;
                    try {
                        if (zzjVar != null) {
                            byte[] bArr2 = new byte[i2];
                            aade aadeVar4 = zzuVar.a;
                            try {
                                int i11 = aadeVar4.memoizedSerializedSize;
                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                    iA2 = abza.a.a(aadeVar4.getClass()).a(aadeVar4);
                                    if (iA2 < 0) {
                                        throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                                    }
                                } else {
                                    iA2 = i11 & Integer.MAX_VALUE;
                                    if (iA2 == Integer.MAX_VALUE) {
                                        iA2 = abza.a.a(aadeVar4.getClass()).a(aadeVar4);
                                        if (iA2 < 0) {
                                            throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                                        }
                                        aadeVar4.memoizedSerializedSize = (aadeVar4.memoizedSerializedSize & Integer.MIN_VALUE) | iA2;
                                    }
                                }
                                byte[] bArr3 = new byte[iA2];
                                boolean z = abvz.e;
                                abvw abvwVar = new abvw(bArr3, 0, iA2);
                                abza.a.a(aadeVar4.getClass()).m(aadeVar4, abwa.a(abvwVar));
                                abvwVar.K();
                                byte[] bArrB2 = zzjVar.b(bArr3, bArr2);
                                aact aactVar = aact.a;
                                aacs aacsVar = new aacs();
                                abvo abvoVarU = abvo.u(bArrB2, 0, bArrB2.length);
                                if ((aacsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    aacsVar.y();
                                }
                                ((aact) aacsVar.b).c = abvoVarU;
                                aadi aadiVarA = zzz.a(aadeVar4);
                                if ((aacsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    aacsVar.y();
                                }
                                aact aactVar2 = (aact) aacsVar.b;
                                aadiVarA.getClass();
                                aactVar2.d = aadiVarA;
                                aactVar2.b |= 1;
                                aact aactVar3 = (aact) aacsVar.v();
                                try {
                                    int i12 = aactVar3.memoizedSerializedSize;
                                    if ((i12 & Integer.MIN_VALUE) != 0) {
                                        iA3 = abza.a.a(aactVar3.getClass()).a(aactVar3);
                                        if (iA3 < 0) {
                                            throw new IllegalStateException(a.b(iA3, "serialized size must be non-negative, was "));
                                        }
                                    } else {
                                        iA3 = i12 & Integer.MAX_VALUE;
                                        if (iA3 == Integer.MAX_VALUE) {
                                            iA3 = abza.a.a(aactVar3.getClass()).a(aactVar3);
                                            if (iA3 < 0) {
                                                throw new IllegalStateException(a.b(iA3, "serialized size must be non-negative, was "));
                                            }
                                            aactVar3.memoizedSerializedSize = (aactVar3.memoizedSerializedSize & Integer.MIN_VALUE) | iA3;
                                        }
                                    }
                                    byte[] bArr4 = new byte[iA3];
                                    abvw abvwVar2 = new abvw(bArr4, 0, iA3);
                                    abza.a.a(aactVar3.getClass()).m(aactVar3, abwa.a(abvwVar2));
                                    abvwVar2.K();
                                    if (!editorEdit.putString(str4, aafv.a(bArr4)).commit()) {
                                        throw new IOException("Failed to write to SharedPreferences");
                                    }
                                } catch (IOException e) {
                                    throw new RuntimeException(a.C(aactVar3, "byte array"), e);
                                }
                            } catch (IOException e2) {
                                throw new RuntimeException(a.C(aadeVar4, "byte array"), e2);
                            }
                        } else {
                            aade aadeVar5 = zzuVar.a;
                            try {
                                int i13 = aadeVar5.memoizedSerializedSize;
                                if ((i13 & Integer.MIN_VALUE) != 0) {
                                    iA = abza.a.a(aadeVar5.getClass()).a(aadeVar5);
                                    if (iA < 0) {
                                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                    }
                                } else {
                                    iA = i13 & Integer.MAX_VALUE;
                                    if (iA == Integer.MAX_VALUE) {
                                        iA = abza.a.a(aadeVar5.getClass()).a(aadeVar5);
                                        if (iA < 0) {
                                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                        }
                                        aadeVar5.memoizedSerializedSize = (aadeVar5.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                                    }
                                }
                                byte[] bArr5 = new byte[iA];
                                boolean z2 = abvz.e;
                                abvw abvwVar3 = new abvw(bArr5, 0, iA);
                                abza.a.a(aadeVar5.getClass()).m(aadeVar5, abwa.a(abvwVar3));
                                abvwVar3.K();
                                if (!editorEdit.putString(str4, aafv.a(bArr5)).commit()) {
                                    throw new IOException("Failed to write to SharedPreferences");
                                }
                            } catch (IOException e3) {
                                throw new RuntimeException(a.C(aadeVar5, "byte array"), e3);
                            }
                        }
                        this.f = zzv.b(zzuVar);
                    } catch (IOException e4) {
                        throw new GeneralSecurityException(e4);
                    }
                } else if (this.d != null) {
                    this.f = d(bArr);
                } else {
                    this.f = c(bArr);
                }
                aaahVar = new aaah(this);
            } catch (ClassCastException | IllegalArgumentException unused2) {
                i = 1;
            }
        }
        return aaahVar;
    }
}
