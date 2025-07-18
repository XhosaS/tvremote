package defpackage;

import android.content.res.AssetManager;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhw {
    private static final HashMap A;
    private static final byte[] B;
    private static final tqp[] O;
    private static final tqp[] P;
    private static final tqp[] Q;
    private static final tqp[] R;
    private static final tqp[] S;
    private static final tqp T;
    private static final tqp[] U;
    private static final tqp[] V;
    private static final tqp[] W;
    private static final tqp[] X;
    private static final tqp[] Y;
    public static final int[] a;
    public static final int[] b;
    static final byte[] c;
    static final byte[] d;
    public static final String[] e;
    public static final int[] f;
    public static final byte[] g;
    public static final Charset h;
    static final byte[] i;
    static final tqp[][] j;
    private static final byte[] k;
    private static final byte[] l;
    private static final byte[] m;
    private static final byte[] n;
    private static final byte[] o;
    private static final byte[] p;
    private static final byte[] q;
    private static final byte[] r;
    private static final byte[] s;
    private static final byte[] t;
    private static final byte[] u;
    private static final SimpleDateFormat v;
    private static final SimpleDateFormat w;
    private static final HashMap[] x;
    private static final HashMap[] y;
    private static final Set z;
    private final FileDescriptor C;
    private final AssetManager.AssetInputStream D;
    private int E;
    private final HashMap[] F;
    private final Set G;
    private ByteOrder H;
    private boolean I;
    private int J;
    private int K;
    private int L;
    private int M;
    private dhu N;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        a = new int[]{8, 8, 8};
        b = new int[]{8};
        c = new byte[]{-1, -40, -1};
        k = new byte[]{102, 116, 121, 112};
        l = new byte[]{109, 105, 102, 49};
        m = new byte[]{104, 101, 105, 99};
        n = new byte[]{97, 118, 105, 102};
        o = new byte[]{97, 118, 105, 115};
        p = new byte[]{79, 76, 89, 77, 80, 0};
        q = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        r = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        d = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        s = new byte[]{82, 73, 70, 70};
        t = new byte[]{87, 69, 66, 80};
        u = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        e = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        g = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        tqp[] tqpVarArr = {new tqp("NewSubfileType", 254, 4), new tqp("SubfileType", 255, 4), new tqp("ImageWidth", 256, 3, 4), new tqp("ImageLength", 257, 3, 4), new tqp("BitsPerSample", 258, 3), new tqp("Compression", 259, 3), new tqp("PhotometricInterpretation", 262, 3), new tqp("ImageDescription", 270, 2), new tqp("Make", 271, 2), new tqp("Model", 272, 2), new tqp("StripOffsets", 273, 3, 4), new tqp("Orientation", 274, 3), new tqp("SamplesPerPixel", 277, 3), new tqp("RowsPerStrip", 278, 3, 4), new tqp("StripByteCounts", 279, 3, 4), new tqp("XResolution", 282, 5), new tqp("YResolution", 283, 5), new tqp("PlanarConfiguration", 284, 3), new tqp("ResolutionUnit", 296, 3), new tqp("TransferFunction", 301, 3), new tqp("Software", 305, 2), new tqp("DateTime", 306, 2), new tqp("Artist", 315, 2), new tqp("WhitePoint", 318, 5), new tqp("PrimaryChromaticities", 319, 5), new tqp("SubIFDPointer", 330, 4), new tqp("JPEGInterchangeFormat", 513, 4), new tqp("JPEGInterchangeFormatLength", 514, 4), new tqp("YCbCrCoefficients", 529, 5), new tqp("YCbCrSubSampling", 530, 3), new tqp("YCbCrPositioning", 531, 3), new tqp("ReferenceBlackWhite", 532, 5), new tqp("Copyright", 33432, 2), new tqp("ExifIFDPointer", 34665, 4), new tqp("GPSInfoIFDPointer", 34853, 4), new tqp("SensorTopBorder", 4, 4), new tqp("SensorLeftBorder", 5, 4), new tqp("SensorBottomBorder", 6, 4), new tqp("SensorRightBorder", 7, 4), new tqp("ISO", 23, 3), new tqp("JpgFromRaw", 46, 7), new tqp("Xmp", 700, 1)};
        O = tqpVarArr;
        tqp[] tqpVarArr2 = {new tqp("ExposureTime", 33434, 5), new tqp("FNumber", 33437, 5), new tqp("ExposureProgram", 34850, 3), new tqp("SpectralSensitivity", 34852, 2), new tqp("PhotographicSensitivity", 34855, 3), new tqp("OECF", 34856, 7), new tqp("SensitivityType", 34864, 3), new tqp("StandardOutputSensitivity", 34865, 4), new tqp("RecommendedExposureIndex", 34866, 4), new tqp("ISOSpeed", 34867, 4), new tqp("ISOSpeedLatitudeyyy", 34868, 4), new tqp("ISOSpeedLatitudezzz", 34869, 4), new tqp("ExifVersion", 36864, 2), new tqp("DateTimeOriginal", 36867, 2), new tqp("DateTimeDigitized", 36868, 2), new tqp("OffsetTime", 36880, 2), new tqp("OffsetTimeOriginal", 36881, 2), new tqp("OffsetTimeDigitized", 36882, 2), new tqp("ComponentsConfiguration", 37121, 7), new tqp("CompressedBitsPerPixel", 37122, 5), new tqp("ShutterSpeedValue", 37377, 10), new tqp("ApertureValue", 37378, 5), new tqp("BrightnessValue", 37379, 10), new tqp("ExposureBiasValue", 37380, 10), new tqp("MaxApertureValue", 37381, 5), new tqp("SubjectDistance", 37382, 5), new tqp("MeteringMode", 37383, 3), new tqp("LightSource", 37384, 3), new tqp("Flash", 37385, 3), new tqp("FocalLength", 37386, 5), new tqp("SubjectArea", 37396, 3), new tqp("MakerNote", 37500, 7), new tqp("UserComment", 37510, 7), new tqp("SubSecTime", 37520, 2), new tqp("SubSecTimeOriginal", 37521, 2), new tqp("SubSecTimeDigitized", 37522, 2), new tqp("FlashpixVersion", 40960, 7), new tqp("ColorSpace", 40961, 3), new tqp("PixelXDimension", 40962, 3, 4), new tqp("PixelYDimension", 40963, 3, 4), new tqp("RelatedSoundFile", 40964, 2), new tqp("InteroperabilityIFDPointer", 40965, 4), new tqp("FlashEnergy", 41483, 5), new tqp("SpatialFrequencyResponse", 41484, 7), new tqp("FocalPlaneXResolution", 41486, 5), new tqp("FocalPlaneYResolution", 41487, 5), new tqp("FocalPlaneResolutionUnit", 41488, 3), new tqp("SubjectLocation", 41492, 3), new tqp("ExposureIndex", 41493, 5), new tqp("SensingMethod", 41495, 3), new tqp("FileSource", 41728, 7), new tqp("SceneType", 41729, 7), new tqp("CFAPattern", 41730, 7), new tqp("CustomRendered", 41985, 3), new tqp("ExposureMode", 41986, 3), new tqp("WhiteBalance", 41987, 3), new tqp("DigitalZoomRatio", 41988, 5), new tqp("FocalLengthIn35mmFilm", 41989, 3), new tqp("SceneCaptureType", 41990, 3), new tqp("GainControl", 41991, 3), new tqp("Contrast", 41992, 3), new tqp("Saturation", 41993, 3), new tqp("Sharpness", 41994, 3), new tqp("DeviceSettingDescription", 41995, 7), new tqp("SubjectDistanceRange", 41996, 3), new tqp("ImageUniqueID", 42016, 2), new tqp("CameraOwnerName", 42032, 2), new tqp("BodySerialNumber", 42033, 2), new tqp("LensSpecification", 42034, 5), new tqp("LensMake", 42035, 2), new tqp("LensModel", 42036, 2), new tqp("Gamma", 42240, 5), new tqp("DNGVersion", 50706, 1), new tqp("DefaultCropSize", 50720, 3, 4)};
        P = tqpVarArr2;
        tqp[] tqpVarArr3 = {new tqp("GPSVersionID", 0, 1), new tqp("GPSLatitudeRef", 1, 2), new tqp("GPSLatitude", 2, 5, 10), new tqp("GPSLongitudeRef", 3, 2), new tqp("GPSLongitude", 4, 5, 10), new tqp("GPSAltitudeRef", 5, 1), new tqp("GPSAltitude", 6, 5), new tqp("GPSTimeStamp", 7, 5), new tqp("GPSSatellites", 8, 2), new tqp("GPSStatus", 9, 2), new tqp("GPSMeasureMode", 10, 2), new tqp("GPSDOP", 11, 5), new tqp("GPSSpeedRef", 12, 2), new tqp("GPSSpeed", 13, 5), new tqp("GPSTrackRef", 14, 2), new tqp("GPSTrack", 15, 5), new tqp("GPSImgDirectionRef", 16, 2), new tqp("GPSImgDirection", 17, 5), new tqp("GPSMapDatum", 18, 2), new tqp("GPSDestLatitudeRef", 19, 2), new tqp("GPSDestLatitude", 20, 5), new tqp("GPSDestLongitudeRef", 21, 2), new tqp("GPSDestLongitude", 22, 5), new tqp("GPSDestBearingRef", 23, 2), new tqp("GPSDestBearing", 24, 5), new tqp("GPSDestDistanceRef", 25, 2), new tqp("GPSDestDistance", 26, 5), new tqp("GPSProcessingMethod", 27, 7), new tqp("GPSAreaInformation", 28, 7), new tqp("GPSDateStamp", 29, 2), new tqp("GPSDifferential", 30, 3), new tqp("GPSHPositioningError", 31, 5)};
        Q = tqpVarArr3;
        tqp[] tqpVarArr4 = {new tqp("InteroperabilityIndex", 1, 2)};
        R = tqpVarArr4;
        tqp[] tqpVarArr5 = {new tqp("NewSubfileType", 254, 4), new tqp("SubfileType", 255, 4), new tqp("ThumbnailImageWidth", 256, 3, 4), new tqp("ThumbnailImageLength", 257, 3, 4), new tqp("BitsPerSample", 258, 3), new tqp("Compression", 259, 3), new tqp("PhotometricInterpretation", 262, 3), new tqp("ImageDescription", 270, 2), new tqp("Make", 271, 2), new tqp("Model", 272, 2), new tqp("StripOffsets", 273, 3, 4), new tqp("ThumbnailOrientation", 274, 3), new tqp("SamplesPerPixel", 277, 3), new tqp("RowsPerStrip", 278, 3, 4), new tqp("StripByteCounts", 279, 3, 4), new tqp("XResolution", 282, 5), new tqp("YResolution", 283, 5), new tqp("PlanarConfiguration", 284, 3), new tqp("ResolutionUnit", 296, 3), new tqp("TransferFunction", 301, 3), new tqp("Software", 305, 2), new tqp("DateTime", 306, 2), new tqp("Artist", 315, 2), new tqp("WhitePoint", 318, 5), new tqp("PrimaryChromaticities", 319, 5), new tqp("SubIFDPointer", 330, 4), new tqp("JPEGInterchangeFormat", 513, 4), new tqp("JPEGInterchangeFormatLength", 514, 4), new tqp("YCbCrCoefficients", 529, 5), new tqp("YCbCrSubSampling", 530, 3), new tqp("YCbCrPositioning", 531, 3), new tqp("ReferenceBlackWhite", 532, 5), new tqp("Copyright", 33432, 2), new tqp("ExifIFDPointer", 34665, 4), new tqp("GPSInfoIFDPointer", 34853, 4), new tqp("DNGVersion", 50706, 1), new tqp("DefaultCropSize", 50720, 3, 4)};
        S = tqpVarArr5;
        T = new tqp("StripOffsets", 273, 3);
        tqp[] tqpVarArr6 = {new tqp("ThumbnailImage", 256, 7), new tqp("CameraSettingsIFDPointer", 8224, 4), new tqp("ImageProcessingIFDPointer", 8256, 4)};
        U = tqpVarArr6;
        tqp[] tqpVarArr7 = {new tqp("PreviewImageStart", 257, 4), new tqp("PreviewImageLength", 258, 4)};
        V = tqpVarArr7;
        tqp[] tqpVarArr8 = {new tqp("AspectFrame", 4371, 3)};
        W = tqpVarArr8;
        tqp[] tqpVarArr9 = {new tqp("ColorSpace", 55, 3)};
        X = tqpVarArr9;
        j = new tqp[][]{tqpVarArr, tqpVarArr2, tqpVarArr3, tqpVarArr4, tqpVarArr5, tqpVarArr, tqpVarArr6, tqpVarArr7, tqpVarArr8, tqpVarArr9};
        Y = new tqp[]{new tqp("SubIFDPointer", 330, 4), new tqp("ExifIFDPointer", 34665, 4), new tqp("GPSInfoIFDPointer", 34853, 4), new tqp("InteroperabilityIFDPointer", 40965, 4), new tqp("CameraSettingsIFDPointer", 8224, 1), new tqp("ImageProcessingIFDPointer", 8256, 1)};
        x = new HashMap[10];
        y = new HashMap[10];
        z = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        A = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        h = charsetForName;
        i = "Exif\u0000\u0000".getBytes(charsetForName);
        B = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        v = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        w = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            tqp[][] tqpVarArr10 = j;
            int length = tqpVarArr10.length;
            if (i2 >= 10) {
                tqp[] tqpVarArr11 = Y;
                Integer numValueOf = Integer.valueOf(tqpVarArr11[0].b);
                HashMap map = A;
                map.put(numValueOf, 5);
                map.put(Integer.valueOf(tqpVarArr11[1].b), 1);
                map.put(Integer.valueOf(tqpVarArr11[2].b), 2);
                map.put(Integer.valueOf(tqpVarArr11[3].b), 3);
                map.put(Integer.valueOf(tqpVarArr11[4].b), 7);
                map.put(Integer.valueOf(tqpVarArr11[5].b), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            x[i2] = new HashMap();
            y[i2] = new HashMap();
            for (tqp tqpVar : tqpVarArr10[i2]) {
                x[i2].put(Integer.valueOf(tqpVar.b), tqpVar);
                y[i2].put(tqpVar.d, tqpVar);
            }
            i2++;
        }
    }

    public dhw(InputStream inputStream) throws Throwable {
        int length = j.length;
        this.F = new HashMap[10];
        this.G = new HashSet(10);
        this.H = ByteOrder.BIG_ENDIAN;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.D = (AssetManager.AssetInputStream) inputStream;
            this.C = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.D = null;
                this.C = fileInputStream.getFD();
            } catch (Exception unused) {
            }
        } else {
            this.D = null;
            this.C = null;
        }
        k(inputStream);
    }

    private final dhu d(String str) {
        dhu dhuVar;
        int i2;
        dhu dhuVar2;
        if (true == "ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        int i3 = 0;
        if ("Xmp".equals(str) && (i2 = this.E) != 4 && ((i2 == 9 || i2 == 15 || i2 == 12 || i2 == 13) && (dhuVar2 = this.N) != null)) {
            return dhuVar2;
        }
        while (true) {
            int length = j.length;
            if (i3 >= 10) {
                if (!"Xmp".equals(str) || (dhuVar = this.N) == null) {
                    return null;
                }
                return dhuVar;
            }
            dhu dhuVar3 = (dhu) this.F[i3].get(str);
            if (dhuVar3 != null) {
                return dhuVar3;
            }
            i3++;
        }
    }

    private final void e() throws Throwable {
        String strB = b("DateTimeOriginal");
        if (strB != null && b("DateTime") == null) {
            this.F[0].put("DateTime", dhu.b(strB));
        }
        if (b("ImageWidth") == null) {
            this.F[0].put("ImageWidth", dhu.c(0L, this.H));
        }
        if (b("ImageLength") == null) {
            this.F[0].put("ImageLength", dhu.c(0L, this.H));
        }
        if (b("Orientation") == null) {
            this.F[0].put("Orientation", dhu.c(0L, this.H));
        }
        if (b("LightSource") == null) {
            this.F[1].put("LightSource", dhu.c(0L, this.H));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0103, code lost:
    
        r20.c = r19.H;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0107, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0047. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x004a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x004d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f1 A[LOOP:0: B:7:0x001e->B:46:0x00f1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void f(defpackage.dht r20, int r21, int r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhw.f(dht, int, int):void");
    }

    private final void g(dht dhtVar) throws Throwable {
        byte[] bArr;
        int length;
        dhtVar.c = ByteOrder.BIG_ENDIAN;
        int i2 = dhtVar.b;
        int length2 = r.length;
        dhtVar.b(8);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (z2) {
                if (z3) {
                    return;
                } else {
                    z3 = false;
                }
            }
            try {
                int i3 = dhtVar.readInt();
                int i4 = dhtVar.readInt();
                int i5 = dhtVar.b;
                int i6 = i5 + i3;
                int i7 = i5 - i2;
                if (i7 == 16) {
                    if (i4 != 1229472850) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                    }
                    i7 = 16;
                }
                if (i4 == 1229278788) {
                    return;
                }
                if (i4 == 1700284774) {
                    if (z2) {
                        continue;
                    } else {
                        this.J = i7;
                        byte[] bArr2 = new byte[i3];
                        dhtVar.readFully(bArr2);
                        int i8 = dhtVar.readInt();
                        CRC32 crc32 = new CRC32();
                        crc32.update(101);
                        crc32.update(25944);
                        crc32.update(6641737);
                        crc32.update(1700284774);
                        crc32.update(bArr2);
                        if (((int) crc32.getValue()) != i8) {
                            throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i8 + ", calculated CRC value: " + crc32.getValue());
                        }
                        m(bArr2, 0);
                        q();
                        o(new dht(bArr2));
                        z2 = true;
                    }
                } else if (i4 == 1767135348 && !z3 && i3 >= (length = (bArr = d).length)) {
                    byte[] bArr3 = new byte[length];
                    dhtVar.readFully(bArr3);
                    if (Arrays.equals(bArr3, bArr)) {
                        int i9 = dhtVar.b - i2;
                        int i10 = i3 - length;
                        byte[] bArr4 = new byte[i10];
                        dhtVar.readFully(bArr4);
                        this.N = new dhu(1, i10, i9, bArr4);
                        z3 = true;
                    }
                }
                dhtVar.b((i6 + 4) - dhtVar.b);
            } catch (EOFException e2) {
                throw new IOException("Encountered corrupt PNG file.", e2);
            }
        }
    }

    private final void h(dht dhtVar) throws Throwable {
        dhtVar.c = ByteOrder.LITTLE_ENDIAN;
        int length = s.length;
        dhtVar.b(4);
        int i2 = dhtVar.readInt() + 8;
        int length2 = t.length;
        dhtVar.b(4);
        int i3 = 12;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                dhtVar.readFully(bArr);
                int i4 = dhtVar.readInt();
                int i5 = i3 + 8;
                if (Arrays.equals(u, bArr)) {
                    byte[] bArrCopyOfRange = new byte[i4];
                    dhtVar.readFully(bArrCopyOfRange);
                    byte[] bArr2 = i;
                    if (czu.m(bArrCopyOfRange, bArr2)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr2.length, i4);
                    }
                    this.J = i5;
                    m(bArrCopyOfRange, 0);
                    o(new dht(bArrCopyOfRange));
                    return;
                }
                if (i4 % 2 == 1) {
                    i4++;
                }
                i3 = i5 + i4;
                if (i3 == i2) {
                    return;
                }
                if (i3 > i2) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                dhtVar.b(i4);
            } catch (EOFException e2) {
                throw new IOException("Encountered corrupt WebP file.", e2);
            }
        }
    }

    private final void i(dht dhtVar, HashMap map) throws Throwable {
        dhu dhuVar = (dhu) map.get("JPEGInterchangeFormat");
        dhu dhuVar2 = (dhu) map.get("JPEGInterchangeFormatLength");
        if (dhuVar == null || dhuVar2 == null) {
            return;
        }
        int iA = dhuVar.a(this.H);
        int iA2 = dhuVar2.a(this.H);
        if (this.E == 7) {
            iA += this.K;
        }
        if (iA <= 0 || iA2 <= 0 || this.D != null || this.C != null) {
            return;
        }
        dhtVar.b(iA);
        dhtVar.readFully(new byte[iA2]);
    }

    private final void j(dht dhtVar, HashMap map) throws IOException {
        int length;
        int length2;
        byte[] bArr;
        dhu dhuVar = (dhu) map.get("StripOffsets");
        dhu dhuVar2 = (dhu) map.get("StripByteCounts");
        if (dhuVar == null || dhuVar2 == null) {
            return;
        }
        long[] jArrN = czu.n(dhuVar.f(this.H));
        long[] jArrN2 = czu.n(dhuVar2.f(this.H));
        if (jArrN == null || (length = jArrN.length) == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrN2 == null || (length2 = jArrN2.length) == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (length != length2) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j2 = 0;
        for (long j3 : jArrN2) {
            j2 += j3;
        }
        byte[] bArr2 = new byte[(int) j2];
        this.I = true;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int length3 = jArrN.length;
            if (i2 >= length3) {
                if (this.I) {
                    long j4 = jArrN[0];
                    return;
                }
                return;
            }
            int i5 = (int) jArrN[i2];
            int i6 = (int) jArrN2[i2];
            if (i2 < length3 - 1) {
                bArr = bArr2;
                if (i5 + i6 != jArrN[i2 + 1]) {
                    this.I = false;
                }
            } else {
                bArr = bArr2;
            }
            int i7 = i5 - i3;
            if (i7 < 0) {
                return;
            }
            try {
                dhtVar.b(i7);
                int i8 = i3 + i7;
                byte[] bArr3 = new byte[i6];
                dhtVar.readFully(bArr3);
                i2++;
                i3 = i8 + i6;
                System.arraycopy(bArr3, 0, bArr, i4, i6);
                i4 += i6;
                bArr2 = bArr;
            } catch (EOFException unused) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03a2 A[Catch: all -> 0x044a, IOException | UnsupportedOperationException -> 0x044f, IOException | UnsupportedOperationException -> 0x044f, TryCatch #3 {all -> 0x044a, blocks: (B:3:0x0007, B:5:0x000e, B:6:0x001a, B:7:0x002f, B:9:0x0044, B:11:0x004c, B:12:0x0058, B:14:0x005b, B:16:0x0061, B:27:0x0086, B:41:0x00af, B:54:0x00cc, B:56:0x00d1, B:59:0x00d9, B:61:0x00de, B:64:0x00e7, B:66:0x00ec, B:68:0x00f1, B:71:0x00fb, B:73:0x0100, B:48:0x00c0, B:49:0x00c3, B:52:0x00c7, B:34:0x0094, B:35:0x0097, B:38:0x009b, B:79:0x0116, B:86:0x0127, B:90:0x0139, B:92:0x014a, B:94:0x0175, B:98:0x0186, B:101:0x01a1, B:102:0x01af, B:104:0x01bb, B:106:0x01c5, B:109:0x01c9, B:111:0x01d0, B:113:0x01d6, B:115:0x01de, B:116:0x01e2, B:117:0x01fa, B:95:0x017b, B:97:0x0181, B:176:0x0380, B:120:0x0213, B:122:0x0224, B:123:0x0231, B:126:0x0247, B:127:0x024e, B:128:0x0253, B:132:0x025e, B:135:0x0263, B:136:0x026a, B:137:0x026b, B:175:0x037d, B:183:0x0396, B:184:0x0399, B:185:0x039a, B:186:0x03a1, B:187:0x03a2, B:189:0x03ab, B:191:0x03b3, B:193:0x03ba, B:195:0x040b, B:197:0x0419, B:198:0x043c, B:200:0x0446, B:75:0x0105, B:77:0x010d), top: B:215:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03ab A[Catch: all -> 0x044a, IOException | UnsupportedOperationException -> 0x044f, IOException | UnsupportedOperationException -> 0x044f, TryCatch #3 {all -> 0x044a, blocks: (B:3:0x0007, B:5:0x000e, B:6:0x001a, B:7:0x002f, B:9:0x0044, B:11:0x004c, B:12:0x0058, B:14:0x005b, B:16:0x0061, B:27:0x0086, B:41:0x00af, B:54:0x00cc, B:56:0x00d1, B:59:0x00d9, B:61:0x00de, B:64:0x00e7, B:66:0x00ec, B:68:0x00f1, B:71:0x00fb, B:73:0x0100, B:48:0x00c0, B:49:0x00c3, B:52:0x00c7, B:34:0x0094, B:35:0x0097, B:38:0x009b, B:79:0x0116, B:86:0x0127, B:90:0x0139, B:92:0x014a, B:94:0x0175, B:98:0x0186, B:101:0x01a1, B:102:0x01af, B:104:0x01bb, B:106:0x01c5, B:109:0x01c9, B:111:0x01d0, B:113:0x01d6, B:115:0x01de, B:116:0x01e2, B:117:0x01fa, B:95:0x017b, B:97:0x0181, B:176:0x0380, B:120:0x0213, B:122:0x0224, B:123:0x0231, B:126:0x0247, B:127:0x024e, B:128:0x0253, B:132:0x025e, B:135:0x0263, B:136:0x026a, B:137:0x026b, B:175:0x037d, B:183:0x0396, B:184:0x0399, B:185:0x039a, B:186:0x03a1, B:187:0x03a2, B:189:0x03ab, B:191:0x03b3, B:193:0x03ba, B:195:0x040b, B:197:0x0419, B:198:0x043c, B:200:0x0446, B:75:0x0105, B:77:0x010d), top: B:215:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d1 A[Catch: all -> 0x044a, IOException | UnsupportedOperationException -> 0x044f, IOException | UnsupportedOperationException -> 0x044f, TryCatch #3 {all -> 0x044a, blocks: (B:3:0x0007, B:5:0x000e, B:6:0x001a, B:7:0x002f, B:9:0x0044, B:11:0x004c, B:12:0x0058, B:14:0x005b, B:16:0x0061, B:27:0x0086, B:41:0x00af, B:54:0x00cc, B:56:0x00d1, B:59:0x00d9, B:61:0x00de, B:64:0x00e7, B:66:0x00ec, B:68:0x00f1, B:71:0x00fb, B:73:0x0100, B:48:0x00c0, B:49:0x00c3, B:52:0x00c7, B:34:0x0094, B:35:0x0097, B:38:0x009b, B:79:0x0116, B:86:0x0127, B:90:0x0139, B:92:0x014a, B:94:0x0175, B:98:0x0186, B:101:0x01a1, B:102:0x01af, B:104:0x01bb, B:106:0x01c5, B:109:0x01c9, B:111:0x01d0, B:113:0x01d6, B:115:0x01de, B:116:0x01e2, B:117:0x01fa, B:95:0x017b, B:97:0x0181, B:176:0x0380, B:120:0x0213, B:122:0x0224, B:123:0x0231, B:126:0x0247, B:127:0x024e, B:128:0x0253, B:132:0x025e, B:135:0x0263, B:136:0x026a, B:137:0x026b, B:175:0x037d, B:183:0x0396, B:184:0x0399, B:185:0x039a, B:186:0x03a1, B:187:0x03a2, B:189:0x03ab, B:191:0x03b3, B:193:0x03ba, B:195:0x040b, B:197:0x0419, B:198:0x043c, B:200:0x0446, B:75:0x0105, B:77:0x010d), top: B:215:0x0007 }] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [android.media.MediaMetadataRetriever] */
    /* JADX WARN: Type inference failed for: r3v14, types: [android.media.MediaMetadataRetriever] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void k(java.io.InputStream r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1107
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhw.k(java.io.InputStream):void");
    }

    private final void l(dht dhtVar) throws IOException {
        ByteOrder byteOrderW = w(dhtVar);
        this.H = byteOrderW;
        dhtVar.c = byteOrderW;
        int unsignedShort = dhtVar.readUnsignedShort();
        int i2 = this.E;
        if (i2 != 7 && i2 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: ".concat(String.valueOf(Integer.toHexString(unsignedShort))));
        }
        int i3 = dhtVar.readInt();
        if (i3 < 8) {
            throw new IOException(a.cf(i3, "Invalid first Ifd offset: "));
        }
        int i4 = i3 - 8;
        if (i4 > 0) {
            dhtVar.b(i4);
        }
    }

    private final void m(byte[] bArr, int i2) throws IOException {
        dht dhtVar = new dht(bArr, (byte[]) null);
        l(dhtVar);
        t(dhtVar, i2);
    }

    private final void n(int i2, String str, String str2) {
        HashMap[] mapArr = this.F;
        if (mapArr[i2].isEmpty() || mapArr[i2].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i2];
        map.put(str2, (dhu) map.get(str));
        mapArr[i2].remove(str);
    }

    private final void o(dht dhtVar) throws Throwable {
        dhu dhuVar;
        HashMap map = this.F[4];
        dhu dhuVar2 = (dhu) map.get("Compression");
        if (dhuVar2 == null) {
            i(dhtVar, map);
            return;
        }
        int iA = dhuVar2.a(this.H);
        if (iA != 1) {
            if (iA == 6) {
                i(dhtVar, map);
                return;
            } else if (iA != 7) {
                return;
            }
        }
        dhu dhuVar3 = (dhu) map.get("BitsPerSample");
        if (dhuVar3 != null) {
            int[] iArr = (int[]) dhuVar3.f(this.H);
            int[] iArr2 = a;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.E != 3 || (dhuVar = (dhu) map.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int iA2 = dhuVar.a(this.H);
                if (iA2 == 1) {
                    if (!Arrays.equals(iArr, b)) {
                        return;
                    }
                } else if (iA2 != 6 || !Arrays.equals(iArr, iArr2)) {
                    return;
                }
            }
            j(dhtVar, map);
        }
    }

    private final void p(int i2, int i3) throws Throwable {
        HashMap[] mapArr = this.F;
        if (mapArr[i2].isEmpty() || mapArr[i3].isEmpty()) {
            return;
        }
        dhu dhuVar = (dhu) mapArr[i2].get("ImageLength");
        dhu dhuVar2 = (dhu) mapArr[i2].get("ImageWidth");
        dhu dhuVar3 = (dhu) mapArr[i3].get("ImageLength");
        dhu dhuVar4 = (dhu) mapArr[i3].get("ImageWidth");
        if (dhuVar == null || dhuVar2 == null || dhuVar3 == null || dhuVar4 == null) {
            return;
        }
        int iA = dhuVar.a(this.H);
        int iA2 = dhuVar2.a(this.H);
        int iA3 = dhuVar3.a(this.H);
        int iA4 = dhuVar4.a(this.H);
        if (iA >= iA3 || iA2 >= iA4) {
            return;
        }
        HashMap map = mapArr[i2];
        mapArr[i2] = mapArr[i3];
        mapArr[i3] = map;
    }

    private final void q() throws Throwable {
        p(0, 5);
        p(0, 4);
        p(5, 4);
        HashMap[] mapArr = this.F;
        dhu dhuVar = (dhu) mapArr[1].get("PixelXDimension");
        dhu dhuVar2 = (dhu) mapArr[1].get("PixelYDimension");
        if (dhuVar != null && dhuVar2 != null) {
            mapArr[0].put("ImageWidth", dhuVar);
            mapArr[0].put("ImageLength", dhuVar2);
        }
        if (mapArr[4].isEmpty() && r(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        r(mapArr[4]);
        n(0, "ThumbnailOrientation", "Orientation");
        n(0, "ThumbnailImageLength", "ImageLength");
        n(0, "ThumbnailImageWidth", "ImageWidth");
        n(5, "ThumbnailOrientation", "Orientation");
        n(5, "ThumbnailImageLength", "ImageLength");
        n(5, "ThumbnailImageWidth", "ImageWidth");
        n(4, "Orientation", "ThumbnailOrientation");
        n(4, "ImageLength", "ThumbnailImageLength");
        n(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private final boolean r(HashMap map) {
        dhu dhuVar = (dhu) map.get("ImageLength");
        dhu dhuVar2 = (dhu) map.get("ImageWidth");
        if (dhuVar == null || dhuVar2 == null) {
            return false;
        }
        return dhuVar.a(this.H) <= 512 && dhuVar2.a(this.H) <= 512;
    }

    private final void s(dht dhtVar) throws Throwable {
        l(dhtVar);
        t(dhtVar, 0);
        u(dhtVar, 0);
        u(dhtVar, 5);
        u(dhtVar, 4);
        q();
        if (this.E == 8) {
            HashMap[] mapArr = this.F;
            dhu dhuVar = (dhu) mapArr[1].get("MakerNote");
            if (dhuVar != null) {
                dht dhtVar2 = new dht(dhuVar.d, (byte[]) null);
                dhtVar2.c = this.H;
                dhtVar2.b(6);
                t(dhtVar2, 9);
                dhu dhuVar2 = (dhu) mapArr[9].get("ColorSpace");
                if (dhuVar2 != null) {
                    mapArr[1].put("ColorSpace", dhuVar2);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        if (r11 == 8) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void t(defpackage.dht r24, int r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhw.t(dht, int):void");
    }

    private final void u(dht dhtVar, int i2) throws Throwable {
        dhu dhuVarE;
        dhu dhuVarE2;
        HashMap[] mapArr = this.F;
        dhu dhuVar = (dhu) mapArr[i2].get("DefaultCropSize");
        dhu dhuVar2 = (dhu) mapArr[i2].get("SensorTopBorder");
        dhu dhuVar3 = (dhu) mapArr[i2].get("SensorLeftBorder");
        dhu dhuVar4 = (dhu) mapArr[i2].get("SensorBottomBorder");
        dhu dhuVar5 = (dhu) mapArr[i2].get("SensorRightBorder");
        if (dhuVar != null) {
            if (dhuVar.a == 5) {
                dhv[] dhvVarArr = (dhv[]) dhuVar.f(this.H);
                if (dhvVarArr == null || dhvVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=".concat(String.valueOf(Arrays.toString(dhvVarArr))));
                    return;
                } else {
                    dhuVarE = dhu.d(dhvVarArr[0], this.H);
                    dhuVarE2 = dhu.d(dhvVarArr[1], this.H);
                }
            } else {
                int[] iArr = (int[]) dhuVar.f(this.H);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=".concat(String.valueOf(Arrays.toString(iArr))));
                    return;
                } else {
                    dhuVarE = dhu.e(iArr[0], this.H);
                    dhuVarE2 = dhu.e(iArr[1], this.H);
                }
            }
            mapArr[i2].put("ImageWidth", dhuVarE);
            mapArr[i2].put("ImageLength", dhuVarE2);
            return;
        }
        if (dhuVar2 != null && dhuVar3 != null && dhuVar4 != null && dhuVar5 != null) {
            int iA = dhuVar2.a(this.H);
            int iA2 = dhuVar4.a(this.H);
            int iA3 = dhuVar5.a(this.H);
            int iA4 = dhuVar3.a(this.H);
            if (iA2 <= iA || iA3 <= iA4) {
                return;
            }
            dhu dhuVarE3 = dhu.e(iA2 - iA, this.H);
            dhu dhuVarE4 = dhu.e(iA3 - iA4, this.H);
            mapArr[i2].put("ImageLength", dhuVarE3);
            mapArr[i2].put("ImageWidth", dhuVarE4);
            return;
        }
        dhu dhuVar6 = (dhu) mapArr[i2].get("ImageLength");
        dhu dhuVar7 = (dhu) mapArr[i2].get("ImageWidth");
        if (dhuVar6 == null || dhuVar7 == null) {
            dhu dhuVar8 = (dhu) mapArr[i2].get("JPEGInterchangeFormat");
            dhu dhuVar9 = (dhu) mapArr[i2].get("JPEGInterchangeFormatLength");
            if (dhuVar8 == null || dhuVar9 == null) {
                return;
            }
            int iA5 = dhuVar8.a(this.H);
            int iA6 = dhuVar8.a(this.H);
            dhtVar.c(iA5);
            byte[] bArr = new byte[iA6];
            dhtVar.readFully(bArr);
            f(new dht(bArr), iA5, i2);
        }
    }

    private static final int v(byte[] bArr) throws Throwable {
        dht dhtVar;
        long j2;
        byte[] bArr2;
        long j3;
        dht dhtVar2 = null;
        try {
            dhtVar = new dht(bArr);
            try {
                j2 = dhtVar.readInt();
                bArr2 = new byte[4];
                dhtVar.readFully(bArr2);
            } catch (Exception unused) {
                dhtVar2 = dhtVar;
                if (dhtVar2 != null) {
                    dhtVar2.close();
                }
                return 0;
            } catch (Throwable th) {
                th = th;
                dhtVar2 = dhtVar;
                if (dhtVar2 != null) {
                    dhtVar2.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
        if (!Arrays.equals(bArr2, k)) {
            dhtVar.close();
            return 0;
        }
        if (j2 == 1) {
            j2 = dhtVar.readLong();
            j3 = 16;
            if (j2 < 16) {
                dhtVar.close();
                return 0;
            }
        } else {
            j3 = 8;
        }
        if (j2 > 5000) {
            j2 = 5000;
        }
        long j4 = j2 - j3;
        if (j4 < 8) {
            dhtVar.close();
            return 0;
        }
        byte[] bArr3 = new byte[4];
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        for (long j5 = 0; j5 < (j4 >> 2); j5++) {
            try {
                dhtVar.readFully(bArr3);
                if (j5 != 1) {
                    if (Arrays.equals(bArr3, l)) {
                        z2 = true;
                    } else if (Arrays.equals(bArr3, m)) {
                        z3 = true;
                    } else if (Arrays.equals(bArr3, n) || Arrays.equals(bArr3, o)) {
                        z4 = true;
                    }
                    if (!z2) {
                        continue;
                    } else {
                        if (z3) {
                            dhtVar.close();
                            return 12;
                        }
                        if (z4) {
                            dhtVar.close();
                            return 15;
                        }
                    }
                }
            } catch (EOFException unused3) {
                dhtVar.close();
                return 0;
            }
        }
        dhtVar.close();
        return 0;
    }

    private static final ByteOrder w(dht dhtVar) throws IOException {
        short s2 = dhtVar.readShort();
        if (s2 == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s2 == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: ".concat(String.valueOf(Integer.toHexString(s2))));
    }

    public final int a() {
        switch (c()) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public final String b(String str) throws Throwable {
        double d2;
        dhu dhuVarD = d(str);
        if (dhuVarD == null) {
            return null;
        }
        if (str.equals("GPSTimeStamp")) {
            int i2 = dhuVarD.a;
            if (i2 != 5 && i2 != 10) {
                Log.w("ExifInterface", a.cf(i2, "GPS Timestamp format is not rational. format="));
                return null;
            }
            dhv[] dhvVarArr = (dhv[]) dhuVarD.f(this.H);
            if (dhvVarArr == null || dhvVarArr.length != 3) {
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=".concat(String.valueOf(Arrays.toString(dhvVarArr))));
                return null;
            }
            dhv dhvVar = dhvVarArr[0];
            Integer numValueOf = Integer.valueOf((int) (dhvVar.a / dhvVar.b));
            dhv dhvVar2 = dhvVarArr[1];
            Integer numValueOf2 = Integer.valueOf((int) (dhvVar2.a / dhvVar2.b));
            dhv dhvVar3 = dhvVarArr[2];
            return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (dhvVar3.a / dhvVar3.b)));
        }
        if (!z.contains(str)) {
            return dhuVarD.g(this.H);
        }
        try {
            Object objF = dhuVarD.f(this.H);
            if (objF == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objF instanceof String) {
                d2 = Double.parseDouble((String) objF);
            } else if (objF instanceof long[]) {
                long[] jArr = (long[]) objF;
                if (jArr.length != 1) {
                    throw new NumberFormatException("There are more than one component");
                }
                d2 = jArr[0];
            } else if (objF instanceof int[]) {
                int[] iArr = (int[]) objF;
                if (iArr.length != 1) {
                    throw new NumberFormatException("There are more than one component");
                }
                d2 = iArr[0];
            } else if (objF instanceof double[]) {
                double[] dArr = (double[]) objF;
                if (dArr.length != 1) {
                    throw new NumberFormatException("There are more than one component");
                }
                d2 = dArr[0];
            } else {
                if (!(objF instanceof dhv[])) {
                    throw new NumberFormatException("Couldn't find a double value");
                }
                dhv[] dhvVarArr2 = (dhv[]) objF;
                if (dhvVarArr2.length != 1) {
                    throw new NumberFormatException("There are more than one component");
                }
                dhv dhvVar4 = dhvVarArr2[0];
                d2 = dhvVar4.a / dhvVar4.b;
            }
            return Double.toString(d2);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final int c() {
        dhu dhuVarD = d("Orientation");
        if (dhuVarD == null) {
            return 1;
        }
        try {
            return dhuVarD.a(this.H);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }
}
