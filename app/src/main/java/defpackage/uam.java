package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.Locale;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uam extends uaf implements wgt, aeiz, wjd, wwo {
    private uas c;
    private Context d;
    private final bco e = new bco(this);
    private boolean f;

    @Deprecated
    public uam() {
        uea.c();
    }

    static uam aC(tqu tquVar) {
        uam uamVar = new uam();
        aeik.d(uamVar);
        wjj.a(uamVar, tquVar);
        return uamVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03bb A[Catch: all -> 0x0624, TryCatch #1 {all -> 0x0624, blocks: (B:3:0x000f, B:5:0x0030, B:9:0x0090, B:11:0x00a7, B:12:0x00ab, B:14:0x00b9, B:15:0x00c1, B:17:0x00c7, B:18:0x00cc, B:21:0x00de, B:24:0x00eb, B:26:0x00f3, B:28:0x00ff, B:105:0x02e8, B:109:0x0309, B:111:0x03bb, B:113:0x03e9, B:114:0x03ec, B:116:0x0405, B:117:0x0408, B:119:0x0426, B:120:0x0429, B:122:0x043c, B:123:0x043f, B:134:0x04d7, B:136:0x04de, B:138:0x04fd, B:142:0x0523, B:144:0x055f, B:146:0x059f, B:148:0x05af, B:147:0x05a8, B:141:0x0509, B:124:0x0459, B:126:0x0485, B:127:0x0488, B:129:0x04a6, B:130:0x04a9, B:132:0x04bc, B:133:0x04bf, B:31:0x012a, B:34:0x0151, B:37:0x0159, B:39:0x015f, B:73:0x0205, B:75:0x020d, B:83:0x023f, B:85:0x0245, B:86:0x024a, B:88:0x0250, B:89:0x0253, B:91:0x025e, B:94:0x026a, B:96:0x0290, B:97:0x0293, B:99:0x02a7, B:100:0x02aa, B:102:0x02c1, B:103:0x02c4, B:104:0x02e0, B:76:0x0212, B:78:0x0218, B:81:0x021f, B:82:0x0224, B:42:0x0186, B:44:0x0195, B:46:0x0199, B:48:0x019f, B:52:0x01b0, B:56:0x01c2, B:59:0x01c9, B:60:0x01d2, B:61:0x01d3, B:71:0x01e5, B:72:0x01fb), top: B:160:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0459 A[Catch: all -> 0x0624, TryCatch #1 {all -> 0x0624, blocks: (B:3:0x000f, B:5:0x0030, B:9:0x0090, B:11:0x00a7, B:12:0x00ab, B:14:0x00b9, B:15:0x00c1, B:17:0x00c7, B:18:0x00cc, B:21:0x00de, B:24:0x00eb, B:26:0x00f3, B:28:0x00ff, B:105:0x02e8, B:109:0x0309, B:111:0x03bb, B:113:0x03e9, B:114:0x03ec, B:116:0x0405, B:117:0x0408, B:119:0x0426, B:120:0x0429, B:122:0x043c, B:123:0x043f, B:134:0x04d7, B:136:0x04de, B:138:0x04fd, B:142:0x0523, B:144:0x055f, B:146:0x059f, B:148:0x05af, B:147:0x05a8, B:141:0x0509, B:124:0x0459, B:126:0x0485, B:127:0x0488, B:129:0x04a6, B:130:0x04a9, B:132:0x04bc, B:133:0x04bf, B:31:0x012a, B:34:0x0151, B:37:0x0159, B:39:0x015f, B:73:0x0205, B:75:0x020d, B:83:0x023f, B:85:0x0245, B:86:0x024a, B:88:0x0250, B:89:0x0253, B:91:0x025e, B:94:0x026a, B:96:0x0290, B:97:0x0293, B:99:0x02a7, B:100:0x02aa, B:102:0x02c1, B:103:0x02c4, B:104:0x02e0, B:76:0x0212, B:78:0x0218, B:81:0x021f, B:82:0x0224, B:42:0x0186, B:44:0x0195, B:46:0x0199, B:48:0x019f, B:52:0x01b0, B:56:0x01c2, B:59:0x01c9, B:60:0x01d2, B:61:0x01d3, B:71:0x01e5, B:72:0x01fb), top: B:160:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04de A[Catch: all -> 0x0624, TryCatch #1 {all -> 0x0624, blocks: (B:3:0x000f, B:5:0x0030, B:9:0x0090, B:11:0x00a7, B:12:0x00ab, B:14:0x00b9, B:15:0x00c1, B:17:0x00c7, B:18:0x00cc, B:21:0x00de, B:24:0x00eb, B:26:0x00f3, B:28:0x00ff, B:105:0x02e8, B:109:0x0309, B:111:0x03bb, B:113:0x03e9, B:114:0x03ec, B:116:0x0405, B:117:0x0408, B:119:0x0426, B:120:0x0429, B:122:0x043c, B:123:0x043f, B:134:0x04d7, B:136:0x04de, B:138:0x04fd, B:142:0x0523, B:144:0x055f, B:146:0x059f, B:148:0x05af, B:147:0x05a8, B:141:0x0509, B:124:0x0459, B:126:0x0485, B:127:0x0488, B:129:0x04a6, B:130:0x04a9, B:132:0x04bc, B:133:0x04bf, B:31:0x012a, B:34:0x0151, B:37:0x0159, B:39:0x015f, B:73:0x0205, B:75:0x020d, B:83:0x023f, B:85:0x0245, B:86:0x024a, B:88:0x0250, B:89:0x0253, B:91:0x025e, B:94:0x026a, B:96:0x0290, B:97:0x0293, B:99:0x02a7, B:100:0x02aa, B:102:0x02c1, B:103:0x02c4, B:104:0x02e0, B:76:0x0212, B:78:0x0218, B:81:0x021f, B:82:0x0224, B:42:0x0186, B:44:0x0195, B:46:0x0199, B:48:0x019f, B:52:0x01b0, B:56:0x01c2, B:59:0x01c9, B:60:0x01d2, B:61:0x01d3, B:71:0x01e5, B:72:0x01fb), top: B:160:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0509 A[Catch: all -> 0x0624, TryCatch #1 {all -> 0x0624, blocks: (B:3:0x000f, B:5:0x0030, B:9:0x0090, B:11:0x00a7, B:12:0x00ab, B:14:0x00b9, B:15:0x00c1, B:17:0x00c7, B:18:0x00cc, B:21:0x00de, B:24:0x00eb, B:26:0x00f3, B:28:0x00ff, B:105:0x02e8, B:109:0x0309, B:111:0x03bb, B:113:0x03e9, B:114:0x03ec, B:116:0x0405, B:117:0x0408, B:119:0x0426, B:120:0x0429, B:122:0x043c, B:123:0x043f, B:134:0x04d7, B:136:0x04de, B:138:0x04fd, B:142:0x0523, B:144:0x055f, B:146:0x059f, B:148:0x05af, B:147:0x05a8, B:141:0x0509, B:124:0x0459, B:126:0x0485, B:127:0x0488, B:129:0x04a6, B:130:0x04a9, B:132:0x04bc, B:133:0x04bf, B:31:0x012a, B:34:0x0151, B:37:0x0159, B:39:0x015f, B:73:0x0205, B:75:0x020d, B:83:0x023f, B:85:0x0245, B:86:0x024a, B:88:0x0250, B:89:0x0253, B:91:0x025e, B:94:0x026a, B:96:0x0290, B:97:0x0293, B:99:0x02a7, B:100:0x02aa, B:102:0x02c1, B:103:0x02c4, B:104:0x02e0, B:76:0x0212, B:78:0x0218, B:81:0x021f, B:82:0x0224, B:42:0x0186, B:44:0x0195, B:46:0x0199, B:48:0x019f, B:52:0x01b0, B:56:0x01c2, B:59:0x01c9, B:60:0x01d2, B:61:0x01d3, B:71:0x01e5, B:72:0x01fb), top: B:160:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x059f A[Catch: all -> 0x0624, TryCatch #1 {all -> 0x0624, blocks: (B:3:0x000f, B:5:0x0030, B:9:0x0090, B:11:0x00a7, B:12:0x00ab, B:14:0x00b9, B:15:0x00c1, B:17:0x00c7, B:18:0x00cc, B:21:0x00de, B:24:0x00eb, B:26:0x00f3, B:28:0x00ff, B:105:0x02e8, B:109:0x0309, B:111:0x03bb, B:113:0x03e9, B:114:0x03ec, B:116:0x0405, B:117:0x0408, B:119:0x0426, B:120:0x0429, B:122:0x043c, B:123:0x043f, B:134:0x04d7, B:136:0x04de, B:138:0x04fd, B:142:0x0523, B:144:0x055f, B:146:0x059f, B:148:0x05af, B:147:0x05a8, B:141:0x0509, B:124:0x0459, B:126:0x0485, B:127:0x0488, B:129:0x04a6, B:130:0x04a9, B:132:0x04bc, B:133:0x04bf, B:31:0x012a, B:34:0x0151, B:37:0x0159, B:39:0x015f, B:73:0x0205, B:75:0x020d, B:83:0x023f, B:85:0x0245, B:86:0x024a, B:88:0x0250, B:89:0x0253, B:91:0x025e, B:94:0x026a, B:96:0x0290, B:97:0x0293, B:99:0x02a7, B:100:0x02aa, B:102:0x02c1, B:103:0x02c4, B:104:0x02e0, B:76:0x0212, B:78:0x0218, B:81:0x021f, B:82:0x0224, B:42:0x0186, B:44:0x0195, B:46:0x0199, B:48:0x019f, B:52:0x01b0, B:56:0x01c2, B:59:0x01c9, B:60:0x01d2, B:61:0x01d3, B:71:0x01e5, B:72:0x01fb), top: B:160:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x05a8 A[Catch: all -> 0x0624, TryCatch #1 {all -> 0x0624, blocks: (B:3:0x000f, B:5:0x0030, B:9:0x0090, B:11:0x00a7, B:12:0x00ab, B:14:0x00b9, B:15:0x00c1, B:17:0x00c7, B:18:0x00cc, B:21:0x00de, B:24:0x00eb, B:26:0x00f3, B:28:0x00ff, B:105:0x02e8, B:109:0x0309, B:111:0x03bb, B:113:0x03e9, B:114:0x03ec, B:116:0x0405, B:117:0x0408, B:119:0x0426, B:120:0x0429, B:122:0x043c, B:123:0x043f, B:134:0x04d7, B:136:0x04de, B:138:0x04fd, B:142:0x0523, B:144:0x055f, B:146:0x059f, B:148:0x05af, B:147:0x05a8, B:141:0x0509, B:124:0x0459, B:126:0x0485, B:127:0x0488, B:129:0x04a6, B:130:0x04a9, B:132:0x04bc, B:133:0x04bf, B:31:0x012a, B:34:0x0151, B:37:0x0159, B:39:0x015f, B:73:0x0205, B:75:0x020d, B:83:0x023f, B:85:0x0245, B:86:0x024a, B:88:0x0250, B:89:0x0253, B:91:0x025e, B:94:0x026a, B:96:0x0290, B:97:0x0293, B:99:0x02a7, B:100:0x02aa, B:102:0x02c1, B:103:0x02c4, B:104:0x02e0, B:76:0x0212, B:78:0x0218, B:81:0x021f, B:82:0x0224, B:42:0x0186, B:44:0x0195, B:46:0x0199, B:48:0x019f, B:52:0x01b0, B:56:0x01c2, B:59:0x01c9, B:60:0x01d2, B:61:0x01d3, B:71:0x01e5, B:72:0x01fb), top: B:160:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0127 A[EDGE_INSN: B:166:0x0127->B:30:0x0127 BREAK  A[LOOP:0: B:90:0x025c->B:104:0x02e0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020d A[Catch: all -> 0x0624, TryCatch #1 {all -> 0x0624, blocks: (B:3:0x000f, B:5:0x0030, B:9:0x0090, B:11:0x00a7, B:12:0x00ab, B:14:0x00b9, B:15:0x00c1, B:17:0x00c7, B:18:0x00cc, B:21:0x00de, B:24:0x00eb, B:26:0x00f3, B:28:0x00ff, B:105:0x02e8, B:109:0x0309, B:111:0x03bb, B:113:0x03e9, B:114:0x03ec, B:116:0x0405, B:117:0x0408, B:119:0x0426, B:120:0x0429, B:122:0x043c, B:123:0x043f, B:134:0x04d7, B:136:0x04de, B:138:0x04fd, B:142:0x0523, B:144:0x055f, B:146:0x059f, B:148:0x05af, B:147:0x05a8, B:141:0x0509, B:124:0x0459, B:126:0x0485, B:127:0x0488, B:129:0x04a6, B:130:0x04a9, B:132:0x04bc, B:133:0x04bf, B:31:0x012a, B:34:0x0151, B:37:0x0159, B:39:0x015f, B:73:0x0205, B:75:0x020d, B:83:0x023f, B:85:0x0245, B:86:0x024a, B:88:0x0250, B:89:0x0253, B:91:0x025e, B:94:0x026a, B:96:0x0290, B:97:0x0293, B:99:0x02a7, B:100:0x02aa, B:102:0x02c1, B:103:0x02c4, B:104:0x02e0, B:76:0x0212, B:78:0x0218, B:81:0x021f, B:82:0x0224, B:42:0x0186, B:44:0x0195, B:46:0x0199, B:48:0x019f, B:52:0x01b0, B:56:0x01c2, B:59:0x01c9, B:60:0x01d2, B:61:0x01d3, B:71:0x01e5, B:72:0x01fb), top: B:160:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0212 A[Catch: all -> 0x0624, TryCatch #1 {all -> 0x0624, blocks: (B:3:0x000f, B:5:0x0030, B:9:0x0090, B:11:0x00a7, B:12:0x00ab, B:14:0x00b9, B:15:0x00c1, B:17:0x00c7, B:18:0x00cc, B:21:0x00de, B:24:0x00eb, B:26:0x00f3, B:28:0x00ff, B:105:0x02e8, B:109:0x0309, B:111:0x03bb, B:113:0x03e9, B:114:0x03ec, B:116:0x0405, B:117:0x0408, B:119:0x0426, B:120:0x0429, B:122:0x043c, B:123:0x043f, B:134:0x04d7, B:136:0x04de, B:138:0x04fd, B:142:0x0523, B:144:0x055f, B:146:0x059f, B:148:0x05af, B:147:0x05a8, B:141:0x0509, B:124:0x0459, B:126:0x0485, B:127:0x0488, B:129:0x04a6, B:130:0x04a9, B:132:0x04bc, B:133:0x04bf, B:31:0x012a, B:34:0x0151, B:37:0x0159, B:39:0x015f, B:73:0x0205, B:75:0x020d, B:83:0x023f, B:85:0x0245, B:86:0x024a, B:88:0x0250, B:89:0x0253, B:91:0x025e, B:94:0x026a, B:96:0x0290, B:97:0x0293, B:99:0x02a7, B:100:0x02aa, B:102:0x02c1, B:103:0x02c4, B:104:0x02e0, B:76:0x0212, B:78:0x0218, B:81:0x021f, B:82:0x0224, B:42:0x0186, B:44:0x0195, B:46:0x0199, B:48:0x019f, B:52:0x01b0, B:56:0x01c2, B:59:0x01c9, B:60:0x01d2, B:61:0x01d3, B:71:0x01e5, B:72:0x01fb), top: B:160:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0245 A[Catch: all -> 0x0624, TryCatch #1 {all -> 0x0624, blocks: (B:3:0x000f, B:5:0x0030, B:9:0x0090, B:11:0x00a7, B:12:0x00ab, B:14:0x00b9, B:15:0x00c1, B:17:0x00c7, B:18:0x00cc, B:21:0x00de, B:24:0x00eb, B:26:0x00f3, B:28:0x00ff, B:105:0x02e8, B:109:0x0309, B:111:0x03bb, B:113:0x03e9, B:114:0x03ec, B:116:0x0405, B:117:0x0408, B:119:0x0426, B:120:0x0429, B:122:0x043c, B:123:0x043f, B:134:0x04d7, B:136:0x04de, B:138:0x04fd, B:142:0x0523, B:144:0x055f, B:146:0x059f, B:148:0x05af, B:147:0x05a8, B:141:0x0509, B:124:0x0459, B:126:0x0485, B:127:0x0488, B:129:0x04a6, B:130:0x04a9, B:132:0x04bc, B:133:0x04bf, B:31:0x012a, B:34:0x0151, B:37:0x0159, B:39:0x015f, B:73:0x0205, B:75:0x020d, B:83:0x023f, B:85:0x0245, B:86:0x024a, B:88:0x0250, B:89:0x0253, B:91:0x025e, B:94:0x026a, B:96:0x0290, B:97:0x0293, B:99:0x02a7, B:100:0x02aa, B:102:0x02c1, B:103:0x02c4, B:104:0x02e0, B:76:0x0212, B:78:0x0218, B:81:0x021f, B:82:0x0224, B:42:0x0186, B:44:0x0195, B:46:0x0199, B:48:0x019f, B:52:0x01b0, B:56:0x01c2, B:59:0x01c9, B:60:0x01d2, B:61:0x01d3, B:71:0x01e5, B:72:0x01fb), top: B:160:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0250 A[Catch: all -> 0x0624, TryCatch #1 {all -> 0x0624, blocks: (B:3:0x000f, B:5:0x0030, B:9:0x0090, B:11:0x00a7, B:12:0x00ab, B:14:0x00b9, B:15:0x00c1, B:17:0x00c7, B:18:0x00cc, B:21:0x00de, B:24:0x00eb, B:26:0x00f3, B:28:0x00ff, B:105:0x02e8, B:109:0x0309, B:111:0x03bb, B:113:0x03e9, B:114:0x03ec, B:116:0x0405, B:117:0x0408, B:119:0x0426, B:120:0x0429, B:122:0x043c, B:123:0x043f, B:134:0x04d7, B:136:0x04de, B:138:0x04fd, B:142:0x0523, B:144:0x055f, B:146:0x059f, B:148:0x05af, B:147:0x05a8, B:141:0x0509, B:124:0x0459, B:126:0x0485, B:127:0x0488, B:129:0x04a6, B:130:0x04a9, B:132:0x04bc, B:133:0x04bf, B:31:0x012a, B:34:0x0151, B:37:0x0159, B:39:0x015f, B:73:0x0205, B:75:0x020d, B:83:0x023f, B:85:0x0245, B:86:0x024a, B:88:0x0250, B:89:0x0253, B:91:0x025e, B:94:0x026a, B:96:0x0290, B:97:0x0293, B:99:0x02a7, B:100:0x02aa, B:102:0x02c1, B:103:0x02c4, B:104:0x02e0, B:76:0x0212, B:78:0x0218, B:81:0x021f, B:82:0x0224, B:42:0x0186, B:44:0x0195, B:46:0x0199, B:48:0x019f, B:52:0x01b0, B:56:0x01c2, B:59:0x01c9, B:60:0x01d2, B:61:0x01d3, B:71:0x01e5, B:72:0x01fb), top: B:160:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x025e A[Catch: all -> 0x0624, TryCatch #1 {all -> 0x0624, blocks: (B:3:0x000f, B:5:0x0030, B:9:0x0090, B:11:0x00a7, B:12:0x00ab, B:14:0x00b9, B:15:0x00c1, B:17:0x00c7, B:18:0x00cc, B:21:0x00de, B:24:0x00eb, B:26:0x00f3, B:28:0x00ff, B:105:0x02e8, B:109:0x0309, B:111:0x03bb, B:113:0x03e9, B:114:0x03ec, B:116:0x0405, B:117:0x0408, B:119:0x0426, B:120:0x0429, B:122:0x043c, B:123:0x043f, B:134:0x04d7, B:136:0x04de, B:138:0x04fd, B:142:0x0523, B:144:0x055f, B:146:0x059f, B:148:0x05af, B:147:0x05a8, B:141:0x0509, B:124:0x0459, B:126:0x0485, B:127:0x0488, B:129:0x04a6, B:130:0x04a9, B:132:0x04bc, B:133:0x04bf, B:31:0x012a, B:34:0x0151, B:37:0x0159, B:39:0x015f, B:73:0x0205, B:75:0x020d, B:83:0x023f, B:85:0x0245, B:86:0x024a, B:88:0x0250, B:89:0x0253, B:91:0x025e, B:94:0x026a, B:96:0x0290, B:97:0x0293, B:99:0x02a7, B:100:0x02aa, B:102:0x02c1, B:103:0x02c4, B:104:0x02e0, B:76:0x0212, B:78:0x0218, B:81:0x021f, B:82:0x0224, B:42:0x0186, B:44:0x0195, B:46:0x0199, B:48:0x019f, B:52:0x01b0, B:56:0x01c2, B:59:0x01c9, B:60:0x01d2, B:61:0x01d3, B:71:0x01e5, B:72:0x01fb), top: B:160:0x000f }] */
    @Override // defpackage.udh, defpackage.bq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View D(android.view.LayoutInflater r48, android.view.ViewGroup r49, android.os.Bundle r50) {
        /*
            Method dump skipped, instructions count: 1583
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uam.D(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // defpackage.uaf, defpackage.udh, defpackage.bq
    public final void W(Activity activity) {
        this.b.g();
        try {
            super.W(activity);
            wum.n();
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.wio, defpackage.udh, defpackage.bq
    public final void Y() {
        this.b.g();
        try {
            aG();
            uas uasVarL = L();
            uasVarL.c.a(uasVarL.f);
            wum.n();
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.wgt
    /* renamed from: aD, reason: merged with bridge method [inline-methods] */
    public final uas L() {
        uas uasVar = this.c;
        if (uasVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.f) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return uasVar;
    }

    @Override // defpackage.wio, defpackage.wwo
    public final wyt aK() {
        return this.b.b;
    }

    @Override // defpackage.wjd
    public final Locale aM() {
        return wjc.a(this);
    }

    @Override // defpackage.wio, defpackage.wwo
    public final void aN(wyt wytVar, boolean z) {
        this.b.d(wytVar, z);
    }

    @Override // defpackage.wio, defpackage.wwo
    public final void aO(wyt wytVar) {
        this.b.c = wytVar;
    }

    @Override // defpackage.bq
    public final void ae(Bundle bundle) {
        Bundle bundle2 = this.n;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        yqw.M(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.ae(bundle);
    }

    @Override // defpackage.bq, defpackage.bcl
    public final bcg ek() {
        return this.e;
    }

    @Override // defpackage.udh, defpackage.bq
    public final void er() {
        wwt wwtVarB = this.b.b();
        try {
            aF();
            this.f = true;
            wwtVarB.close();
        } catch (Throwable th) {
            try {
                wwtVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bq
    public final LayoutInflater ev(Bundle bundle) {
        this.b.g();
        try {
            LayoutInflater layoutInflaterAr = ar();
            LayoutInflater layoutInflaterCloneInContext = layoutInflaterAr.cloneInContext(new aeiu(layoutInflaterAr, this));
            LayoutInflater layoutInflaterCloneInContext2 = layoutInflaterCloneInContext.cloneInContext(new wjg(this, layoutInflaterCloneInContext));
            wum.n();
            return layoutInflaterCloneInContext2;
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.uaf, defpackage.wio, defpackage.bq
    public final void ex(Context context) {
        this.b.g();
        try {
            if (this.f) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.ex(context);
            if (this.c == null) {
                try {
                    wvx wvxVarD = wzg.d(uam.class, "CreateComponent");
                    try {
                        Object objDN = cO().dN();
                        wvxVarD.close();
                        wvx wvxVarD2 = wzg.d(uam.class, "CreatePeer");
                        try {
                            Activity activity = ((eth) objDN).c.a;
                            aeiv.a(activity);
                            eup eupVar = ((eth) objDN).b;
                            txm txmVar = (txm) eupVar.rU.a();
                            vzc vzcVar = (vzc) ((eth) objDN).k.a();
                            wxc wxcVar = (wxc) eupVar.ii.a();
                            bq bqVar = ((eth) objDN).a;
                            Bundle bundleA = wjk.a(bqVar);
                            ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) eupVar.pq.a();
                            yqw.B(bundleA.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                            tqu tquVar = (tqu) acas.d(bundleA, tqu.a, extensionRegistryLite);
                            tquVar.getClass();
                            if (!(bqVar instanceof uam)) {
                                throw new IllegalStateException(a.B(bqVar, uas.class, "Attempt to inject a Fragment wrapper of type "));
                            }
                            uam uamVar = (uam) bqVar;
                            uamVar.getClass();
                            this.c = new uas(activity, txmVar, vzcVar, wxcVar, tquVar, uamVar);
                            wvxVarD2.close();
                            this.aa.b(new wir(this.b, this.e));
                        } finally {
                        }
                    } finally {
                    }
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            wum.n();
        } finally {
        }
    }

    @Override // defpackage.wio, defpackage.udh, defpackage.bq
    public final void i() {
        final txj txjVar;
        zyd zydVar;
        this.b.g();
        try {
            aH();
            uas uasVarL = L();
            if (!uasVarL.b.isChangingConfigurations() && (txjVar = (txj) uasVarL.c.c.remove(uasVarL.f.c)) != null && (zydVar = txjVar.h) != null) {
                txjVar.d("remove state", xab.b(zydVar).a(new Callable() { // from class: twv
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        txjVar.i.a();
                        return null;
                    }
                }, txjVar.c));
            }
            wum.n();
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.uaf
    protected final /* synthetic */ aeik m() {
        return new wjj(this);
    }

    @Override // defpackage.uaf, defpackage.bq
    public final Context s() {
        if (super.s() == null) {
            return null;
        }
        if (this.d == null) {
            this.d = new wjg(this, super.s());
        }
        return this.d;
    }
}
