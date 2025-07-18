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
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* compiled from: PG */
/* loaded from: classes.dex */
public class asr {
    private static final aso[] A;
    private static final aso[] B;
    private static final aso[] C;
    private static final aso[] D;
    private static final aso E;
    private static final aso[] F;
    private static final aso[] G;
    private static final aso[] H;
    private static final aso[] I;
    private static final aso[] J;
    private static final HashMap[] K;
    private static final HashMap[] L;
    private static final Set M;
    private static final HashMap N;
    private static final byte[] O;
    public static final int[] a;
    public static final int[] b;
    static final byte[] c;
    static final byte[] d;
    public static final String[] e;
    public static final int[] f;
    public static final byte[] g;
    static final aso[][] h;
    public static final Charset i;
    static final byte[] j;
    private static final boolean l = Log.isLoggable("ExifInterface", 3);
    private static final byte[] m;
    private static final byte[] n;
    private static final byte[] o;
    private static final byte[] p;
    private static final byte[] q;
    private static final byte[] r;
    private static final byte[] s;
    private static final byte[] t;
    private static final byte[] u;
    private static final byte[] v;
    private static final byte[] w;
    private static final SimpleDateFormat x;
    private static final SimpleDateFormat y;
    private static final aso[] z;
    private final FileDescriptor P;
    private final AssetManager.AssetInputStream Q;
    private int R;
    private final HashMap[] S;
    private final Set T;
    private boolean U;
    private int V;
    private int W;
    private int X;
    private int Y;
    private asn Z;
    public ByteOrder k;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        a = new int[]{8, 8, 8};
        b = new int[]{8};
        c = new byte[]{-1, -40, -1};
        m = new byte[]{102, 116, 121, 112};
        n = new byte[]{109, 105, 102, 49};
        o = new byte[]{104, 101, 105, 99};
        p = new byte[]{97, 118, 105, 102};
        q = new byte[]{97, 118, 105, 115};
        r = new byte[]{79, 76, 89, 77, 80, 0};
        s = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        t = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        d = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        u = new byte[]{82, 73, 70, 70};
        v = new byte[]{87, 69, 66, 80};
        w = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        e = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        g = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        aso[] asoVarArr = {new aso("NewSubfileType", 254, 4), new aso("SubfileType", 255, 4), new aso("ImageWidth", 256, 3, 4), new aso("ImageLength", 257, 3, 4), new aso("BitsPerSample", 258, 3), new aso("Compression", 259, 3), new aso("PhotometricInterpretation", 262, 3), new aso("ImageDescription", 270, 2), new aso("Make", 271, 2), new aso("Model", 272, 2), new aso("StripOffsets", 273, 3, 4), new aso("Orientation", 274, 3), new aso("SamplesPerPixel", 277, 3), new aso("RowsPerStrip", 278, 3, 4), new aso("StripByteCounts", 279, 3, 4), new aso("XResolution", 282, 5), new aso("YResolution", 283, 5), new aso("PlanarConfiguration", 284, 3), new aso("ResolutionUnit", 296, 3), new aso("TransferFunction", 301, 3), new aso("Software", 305, 2), new aso("DateTime", 306, 2), new aso("Artist", 315, 2), new aso("WhitePoint", 318, 5), new aso("PrimaryChromaticities", 319, 5), new aso("SubIFDPointer", 330, 4), new aso("JPEGInterchangeFormat", 513, 4), new aso("JPEGInterchangeFormatLength", 514, 4), new aso("YCbCrCoefficients", 529, 5), new aso("YCbCrSubSampling", 530, 3), new aso("YCbCrPositioning", 531, 3), new aso("ReferenceBlackWhite", 532, 5), new aso("Copyright", 33432, 2), new aso("ExifIFDPointer", 34665, 4), new aso("GPSInfoIFDPointer", 34853, 4), new aso("SensorTopBorder", 4, 4), new aso("SensorLeftBorder", 5, 4), new aso("SensorBottomBorder", 6, 4), new aso("SensorRightBorder", 7, 4), new aso("ISO", 23, 3), new aso("JpgFromRaw", 46, 7), new aso("Xmp", 700, 1)};
        z = asoVarArr;
        aso[] asoVarArr2 = {new aso("ExposureTime", 33434, 5), new aso("FNumber", 33437, 5), new aso("ExposureProgram", 34850, 3), new aso("SpectralSensitivity", 34852, 2), new aso("PhotographicSensitivity", 34855, 3), new aso("OECF", 34856, 7), new aso("SensitivityType", 34864, 3), new aso("StandardOutputSensitivity", 34865, 4), new aso("RecommendedExposureIndex", 34866, 4), new aso("ISOSpeed", 34867, 4), new aso("ISOSpeedLatitudeyyy", 34868, 4), new aso("ISOSpeedLatitudezzz", 34869, 4), new aso("ExifVersion", 36864, 2), new aso("DateTimeOriginal", 36867, 2), new aso("DateTimeDigitized", 36868, 2), new aso("OffsetTime", 36880, 2), new aso("OffsetTimeOriginal", 36881, 2), new aso("OffsetTimeDigitized", 36882, 2), new aso("ComponentsConfiguration", 37121, 7), new aso("CompressedBitsPerPixel", 37122, 5), new aso("ShutterSpeedValue", 37377, 10), new aso("ApertureValue", 37378, 5), new aso("BrightnessValue", 37379, 10), new aso("ExposureBiasValue", 37380, 10), new aso("MaxApertureValue", 37381, 5), new aso("SubjectDistance", 37382, 5), new aso("MeteringMode", 37383, 3), new aso("LightSource", 37384, 3), new aso("Flash", 37385, 3), new aso("FocalLength", 37386, 5), new aso("SubjectArea", 37396, 3), new aso("MakerNote", 37500, 7), new aso("UserComment", 37510, 7), new aso("SubSecTime", 37520, 2), new aso("SubSecTimeOriginal", 37521, 2), new aso("SubSecTimeDigitized", 37522, 2), new aso("FlashpixVersion", 40960, 7), new aso("ColorSpace", 40961, 3), new aso("PixelXDimension", 40962, 3, 4), new aso("PixelYDimension", 40963, 3, 4), new aso("RelatedSoundFile", 40964, 2), new aso("InteroperabilityIFDPointer", 40965, 4), new aso("FlashEnergy", 41483, 5), new aso("SpatialFrequencyResponse", 41484, 7), new aso("FocalPlaneXResolution", 41486, 5), new aso("FocalPlaneYResolution", 41487, 5), new aso("FocalPlaneResolutionUnit", 41488, 3), new aso("SubjectLocation", 41492, 3), new aso("ExposureIndex", 41493, 5), new aso("SensingMethod", 41495, 3), new aso("FileSource", 41728, 7), new aso("SceneType", 41729, 7), new aso("CFAPattern", 41730, 7), new aso("CustomRendered", 41985, 3), new aso("ExposureMode", 41986, 3), new aso("WhiteBalance", 41987, 3), new aso("DigitalZoomRatio", 41988, 5), new aso("FocalLengthIn35mmFilm", 41989, 3), new aso("SceneCaptureType", 41990, 3), new aso("GainControl", 41991, 3), new aso("Contrast", 41992, 3), new aso("Saturation", 41993, 3), new aso("Sharpness", 41994, 3), new aso("DeviceSettingDescription", 41995, 7), new aso("SubjectDistanceRange", 41996, 3), new aso("ImageUniqueID", 42016, 2), new aso("CameraOwnerName", 42032, 2), new aso("BodySerialNumber", 42033, 2), new aso("LensSpecification", 42034, 5), new aso("LensMake", 42035, 2), new aso("LensModel", 42036, 2), new aso("Gamma", 42240, 5), new aso("DNGVersion", 50706, 1), new aso("DefaultCropSize", 50720, 3, 4)};
        A = asoVarArr2;
        aso[] asoVarArr3 = {new aso("GPSVersionID", 0, 1), new aso("GPSLatitudeRef", 1, 2), new aso("GPSLatitude", 2, 5, 10), new aso("GPSLongitudeRef", 3, 2), new aso("GPSLongitude", 4, 5, 10), new aso("GPSAltitudeRef", 5, 1), new aso("GPSAltitude", 6, 5), new aso("GPSTimeStamp", 7, 5), new aso("GPSSatellites", 8, 2), new aso("GPSStatus", 9, 2), new aso("GPSMeasureMode", 10, 2), new aso("GPSDOP", 11, 5), new aso("GPSSpeedRef", 12, 2), new aso("GPSSpeed", 13, 5), new aso("GPSTrackRef", 14, 2), new aso("GPSTrack", 15, 5), new aso("GPSImgDirectionRef", 16, 2), new aso("GPSImgDirection", 17, 5), new aso("GPSMapDatum", 18, 2), new aso("GPSDestLatitudeRef", 19, 2), new aso("GPSDestLatitude", 20, 5), new aso("GPSDestLongitudeRef", 21, 2), new aso("GPSDestLongitude", 22, 5), new aso("GPSDestBearingRef", 23, 2), new aso("GPSDestBearing", 24, 5), new aso("GPSDestDistanceRef", 25, 2), new aso("GPSDestDistance", 26, 5), new aso("GPSProcessingMethod", 27, 7), new aso("GPSAreaInformation", 28, 7), new aso("GPSDateStamp", 29, 2), new aso("GPSDifferential", 30, 3), new aso("GPSHPositioningError", 31, 5)};
        B = asoVarArr3;
        aso[] asoVarArr4 = {new aso("InteroperabilityIndex", 1, 2)};
        C = asoVarArr4;
        aso[] asoVarArr5 = {new aso("NewSubfileType", 254, 4), new aso("SubfileType", 255, 4), new aso("ThumbnailImageWidth", 256, 3, 4), new aso("ThumbnailImageLength", 257, 3, 4), new aso("BitsPerSample", 258, 3), new aso("Compression", 259, 3), new aso("PhotometricInterpretation", 262, 3), new aso("ImageDescription", 270, 2), new aso("Make", 271, 2), new aso("Model", 272, 2), new aso("StripOffsets", 273, 3, 4), new aso("ThumbnailOrientation", 274, 3), new aso("SamplesPerPixel", 277, 3), new aso("RowsPerStrip", 278, 3, 4), new aso("StripByteCounts", 279, 3, 4), new aso("XResolution", 282, 5), new aso("YResolution", 283, 5), new aso("PlanarConfiguration", 284, 3), new aso("ResolutionUnit", 296, 3), new aso("TransferFunction", 301, 3), new aso("Software", 305, 2), new aso("DateTime", 306, 2), new aso("Artist", 315, 2), new aso("WhitePoint", 318, 5), new aso("PrimaryChromaticities", 319, 5), new aso("SubIFDPointer", 330, 4), new aso("JPEGInterchangeFormat", 513, 4), new aso("JPEGInterchangeFormatLength", 514, 4), new aso("YCbCrCoefficients", 529, 5), new aso("YCbCrSubSampling", 530, 3), new aso("YCbCrPositioning", 531, 3), new aso("ReferenceBlackWhite", 532, 5), new aso("Copyright", 33432, 2), new aso("ExifIFDPointer", 34665, 4), new aso("GPSInfoIFDPointer", 34853, 4), new aso("DNGVersion", 50706, 1), new aso("DefaultCropSize", 50720, 3, 4)};
        D = asoVarArr5;
        E = new aso("StripOffsets", 273, 3);
        aso[] asoVarArr6 = {new aso("ThumbnailImage", 256, 7), new aso("CameraSettingsIFDPointer", 8224, 4), new aso("ImageProcessingIFDPointer", 8256, 4)};
        F = asoVarArr6;
        aso[] asoVarArr7 = {new aso("PreviewImageStart", 257, 4), new aso("PreviewImageLength", 258, 4)};
        G = asoVarArr7;
        aso[] asoVarArr8 = {new aso("AspectFrame", 4371, 3)};
        H = asoVarArr8;
        aso[] asoVarArr9 = {new aso("ColorSpace", 55, 3)};
        I = asoVarArr9;
        h = new aso[][]{asoVarArr, asoVarArr2, asoVarArr3, asoVarArr4, asoVarArr5, asoVarArr, asoVarArr6, asoVarArr7, asoVarArr8, asoVarArr9};
        J = new aso[]{new aso("SubIFDPointer", 330, 4), new aso("ExifIFDPointer", 34665, 4), new aso("GPSInfoIFDPointer", 34853, 4), new aso("InteroperabilityIFDPointer", 40965, 4), new aso("CameraSettingsIFDPointer", 8224, 1), new aso("ImageProcessingIFDPointer", 8256, 1)};
        K = new HashMap[10];
        L = new HashMap[10];
        M = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        N = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        i = charsetForName;
        j = "Exif\u0000\u0000".getBytes(charsetForName);
        O = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        x = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        y = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            aso[][] asoVarArr10 = h;
            int length = asoVarArr10.length;
            if (i2 >= 10) {
                aso[] asoVarArr11 = J;
                Integer numValueOf = Integer.valueOf(asoVarArr11[0].a);
                HashMap map = N;
                map.put(numValueOf, 5);
                map.put(Integer.valueOf(asoVarArr11[1].a), 1);
                map.put(Integer.valueOf(asoVarArr11[2].a), 2);
                map.put(Integer.valueOf(asoVarArr11[3].a), 3);
                map.put(Integer.valueOf(asoVarArr11[4].a), 7);
                map.put(Integer.valueOf(asoVarArr11[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            K[i2] = new HashMap();
            L[i2] = new HashMap();
            for (aso asoVar : asoVarArr10[i2]) {
                K[i2].put(Integer.valueOf(asoVar.a), asoVar);
                L[i2].put(asoVar.b, asoVar);
            }
            i2++;
        }
    }

    public asr(InputStream inputStream) throws Throwable {
        int length = h.length;
        this.S = new HashMap[10];
        this.T = new HashSet(10);
        this.k = ByteOrder.BIG_ENDIAN;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.Q = (AssetManager.AssetInputStream) inputStream;
            this.P = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.Q = null;
                this.P = fileInputStream.getFD();
            } catch (Exception unused) {
                if (l) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
            }
        } else {
            this.Q = null;
            this.P = null;
        }
        l(inputStream);
    }

    private final int c(byte[] bArr) throws Throwable {
        asm asmVar;
        long j2;
        byte[] bArr2;
        long j3;
        asm asmVar2 = null;
        try {
            try {
                asmVar = new asm(bArr);
                try {
                    j2 = asmVar.readInt();
                    bArr2 = new byte[4];
                    asmVar.readFully(bArr2);
                } catch (Exception e2) {
                    e = e2;
                    asmVar2 = asmVar;
                    if (l) {
                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                    }
                    if (asmVar2 != null) {
                        asmVar2.close();
                    }
                    return 0;
                } catch (Throwable th) {
                    th = th;
                    asmVar2 = asmVar;
                    if (asmVar2 != null) {
                        asmVar2.close();
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
            }
            if (!Arrays.equals(bArr2, m)) {
                asmVar.close();
                return 0;
            }
            if (j2 == 1) {
                j2 = asmVar.readLong();
                j3 = 16;
                if (j2 < 16) {
                    asmVar.close();
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
                asmVar.close();
                return 0;
            }
            byte[] bArr3 = new byte[4];
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            for (long j5 = 0; j5 < (j4 >> 2); j5++) {
                try {
                    asmVar.readFully(bArr3);
                    if (j5 != 1) {
                        if (Arrays.equals(bArr3, n)) {
                            z2 = true;
                        } else if (Arrays.equals(bArr3, o)) {
                            z3 = true;
                        } else if (Arrays.equals(bArr3, p) || Arrays.equals(bArr3, q)) {
                            z4 = true;
                        }
                        if (!z2) {
                            continue;
                        } else {
                            if (z3) {
                                asmVar.close();
                                return 12;
                            }
                            if (z4) {
                                asmVar.close();
                                return 15;
                            }
                        }
                    }
                } catch (EOFException unused) {
                    asmVar.close();
                    return 0;
                }
            }
            asmVar.close();
            return 0;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final ByteOrder d(asm asmVar) throws IOException {
        short s2 = asmVar.readShort();
        if (s2 == 18761) {
            if (l) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s2 != 19789) {
            throw new IOException("Invalid byte order: ".concat(String.valueOf(Integer.toHexString(s2))));
        }
        if (l) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    private final void e() throws Throwable {
        String strB = b("DateTimeOriginal");
        if (strB != null && b("DateTime") == null) {
            this.S[0].put("DateTime", asn.b(strB));
        }
        if (b("ImageWidth") == null) {
            this.S[0].put("ImageWidth", asn.c(0L, this.k));
        }
        if (b("ImageLength") == null) {
            this.S[0].put("ImageLength", asn.c(0L, this.k));
        }
        if (b("Orientation") == null) {
            this.S[0].put("Orientation", asn.c(0L, this.k));
        }
        if (b("LightSource") == null) {
            this.S[1].put("LightSource", asn.c(0L, this.k));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0158, code lost:
    
        r22.c = r21.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015c, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x0097. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x009a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x009d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0146 A[LOOP:0: B:10:0x0034->B:55:0x0146, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void f(defpackage.asm r22, int r23, int r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asr.f(asm, int, int):void");
    }

    private final void g(asm asmVar) throws Throwable {
        byte[] bArr;
        int length;
        if (l) {
            Objects.toString(asmVar);
            Log.d("ExifInterface", "getPngAttributes starting with: ".concat(asmVar.toString()));
        }
        asmVar.c = ByteOrder.BIG_ENDIAN;
        int i2 = asmVar.b;
        int length2 = t.length;
        asmVar.b(8);
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
                int i3 = asmVar.readInt();
                int i4 = asmVar.readInt();
                int i5 = asmVar.b;
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
                        this.V = i7;
                        byte[] bArr2 = new byte[i3];
                        asmVar.readFully(bArr2);
                        int i8 = asmVar.readInt();
                        CRC32 crc32 = new CRC32();
                        crc32.update(101);
                        crc32.update(25944);
                        crc32.update(6641737);
                        crc32.update(1700284774);
                        crc32.update(bArr2);
                        if (((int) crc32.getValue()) != i8) {
                            throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i8 + ", calculated CRC value: " + crc32.getValue());
                        }
                        o(bArr2, 0);
                        u();
                        r(new asm(bArr2));
                        z2 = true;
                    }
                } else if (i4 == 1767135348 && !z3 && i3 >= (length = (bArr = d).length)) {
                    byte[] bArr3 = new byte[length];
                    asmVar.readFully(bArr3);
                    if (Arrays.equals(bArr3, bArr)) {
                        int i9 = asmVar.b - i2;
                        int i10 = i3 - length;
                        byte[] bArr4 = new byte[i10];
                        asmVar.readFully(bArr4);
                        this.Z = new asn(1, i10, i9, bArr4);
                        z3 = true;
                    }
                }
                asmVar.b((i6 + 4) - asmVar.b);
            } catch (EOFException e2) {
                throw new IOException("Encountered corrupt PNG file.", e2);
            }
        }
    }

    private final void h(asq asqVar) throws Throwable {
        m(asqVar);
        p(asqVar, 0);
        t(asqVar, 0);
        t(asqVar, 5);
        t(asqVar, 4);
        u();
        if (this.R == 8) {
            HashMap[] mapArr = this.S;
            asn asnVar = (asn) mapArr[1].get("MakerNote");
            if (asnVar != null) {
                asq asqVar2 = new asq(asnVar.d);
                asqVar2.c = this.k;
                asqVar2.b(6);
                p(asqVar2, 9);
                asn asnVar2 = (asn) mapArr[9].get("ColorSpace");
                if (asnVar2 != null) {
                    mapArr[1].put("ColorSpace", asnVar2);
                }
            }
        }
    }

    private final void i(asm asmVar) throws Throwable {
        if (l) {
            Objects.toString(asmVar);
            Log.d("ExifInterface", "getWebpAttributes starting with: ".concat(asmVar.toString()));
        }
        asmVar.c = ByteOrder.LITTLE_ENDIAN;
        int length = u.length;
        asmVar.b(4);
        int i2 = asmVar.readInt() + 8;
        int length2 = v.length;
        asmVar.b(4);
        int i3 = 12;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                asmVar.readFully(bArr);
                int i4 = asmVar.readInt();
                int i5 = i3 + 8;
                if (Arrays.equals(w, bArr)) {
                    byte[] bArrCopyOfRange = new byte[i4];
                    asmVar.readFully(bArrCopyOfRange);
                    byte[] bArr2 = j;
                    if (ass.a(bArrCopyOfRange, bArr2)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr2.length, i4);
                    }
                    this.V = i5;
                    o(bArrCopyOfRange, 0);
                    r(new asm(bArrCopyOfRange));
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
                asmVar.b(i4);
            } catch (EOFException e2) {
                throw new IOException("Encountered corrupt WebP file.", e2);
            }
        }
    }

    private final void j(asm asmVar, HashMap map) throws Throwable {
        asn asnVar = (asn) map.get("JPEGInterchangeFormat");
        asn asnVar2 = (asn) map.get("JPEGInterchangeFormatLength");
        if (asnVar == null || asnVar2 == null) {
            return;
        }
        int iA = asnVar.a(this.k);
        int iA2 = asnVar2.a(this.k);
        if (this.R == 7) {
            iA += this.W;
        }
        if (iA > 0 && iA2 > 0 && this.Q == null && this.P == null) {
            asmVar.b(iA);
            asmVar.readFully(new byte[iA2]);
        }
        if (l) {
            Log.d("ExifInterface", a.k(iA2, iA, "Setting thumbnail attributes with offset: ", ", length: "));
        }
    }

    private final void k(asm asmVar, HashMap map) throws IOException {
        int length;
        int length2;
        byte[] bArr;
        asn asnVar = (asn) map.get("StripOffsets");
        asn asnVar2 = (asn) map.get("StripByteCounts");
        if (asnVar == null || asnVar2 == null) {
            return;
        }
        long[] jArrB = ass.b(asnVar.f(this.k));
        long[] jArrB2 = ass.b(asnVar2.f(this.k));
        if (jArrB == null || (length = jArrB.length) == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrB2 == null || (length2 = jArrB2.length) == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (length != length2) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j2 = 0;
        for (long j3 : jArrB2) {
            j2 += j3;
        }
        byte[] bArr2 = new byte[(int) j2];
        this.U = true;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int length3 = jArrB.length;
            if (i2 >= length3) {
                if (this.U) {
                    long j4 = jArrB[0];
                    return;
                }
                return;
            }
            int i5 = (int) jArrB[i2];
            int i6 = (int) jArrB2[i2];
            if (i2 < length3 - 1) {
                bArr = bArr2;
                if (i5 + i6 != jArrB[i2 + 1]) {
                    this.U = false;
                }
            } else {
                bArr = bArr2;
            }
            int i7 = i5 - i3;
            if (i7 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            try {
                asmVar.b(i7);
                int i8 = i3 + i7;
                byte[] bArr3 = new byte[i6];
                try {
                    asmVar.readFully(bArr3);
                    i2++;
                    i3 = i8 + i6;
                    System.arraycopy(bArr3, 0, bArr, i4, i6);
                    i4 += i6;
                    bArr2 = bArr;
                } catch (EOFException unused) {
                    Log.d("ExifInterface", a.a(i6, "Failed to read ", " bytes."));
                    return;
                }
            } catch (EOFException unused2) {
                Log.d("ExifInterface", a.a(i7, "Failed to skip ", " bytes."));
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02e0 A[Catch: all -> 0x03cc, RuntimeException -> 0x03ce, TryCatch #5 {RuntimeException -> 0x03ce, blocks: (B:140:0x0285, B:142:0x02ab, B:149:0x02e0, B:151:0x02f3, B:153:0x0306, B:162:0x031d, B:165:0x0330, B:167:0x033a, B:169:0x034e, B:170:0x035b, B:171:0x0362, B:172:0x0363, B:173:0x036a, B:174:0x036b, B:177:0x037b, B:178:0x0396, B:180:0x039a, B:144:0x02bf, B:146:0x02c5), top: B:237:0x0285, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02f3 A[Catch: all -> 0x03cc, RuntimeException -> 0x03ce, TryCatch #5 {RuntimeException -> 0x03ce, blocks: (B:140:0x0285, B:142:0x02ab, B:149:0x02e0, B:151:0x02f3, B:153:0x0306, B:162:0x031d, B:165:0x0330, B:167:0x033a, B:169:0x034e, B:170:0x035b, B:171:0x0362, B:172:0x0363, B:173:0x036a, B:174:0x036b, B:177:0x037b, B:178:0x0396, B:180:0x039a, B:144:0x02bf, B:146:0x02c5), top: B:237:0x0285, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0306 A[Catch: all -> 0x03cc, RuntimeException -> 0x03ce, TryCatch #5 {RuntimeException -> 0x03ce, blocks: (B:140:0x0285, B:142:0x02ab, B:149:0x02e0, B:151:0x02f3, B:153:0x0306, B:162:0x031d, B:165:0x0330, B:167:0x033a, B:169:0x034e, B:170:0x035b, B:171:0x0362, B:172:0x0363, B:173:0x036a, B:174:0x036b, B:177:0x037b, B:178:0x0396, B:180:0x039a, B:144:0x02bf, B:146:0x02c5), top: B:237:0x0285, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x033a A[Catch: all -> 0x03cc, RuntimeException -> 0x03ce, TryCatch #5 {RuntimeException -> 0x03ce, blocks: (B:140:0x0285, B:142:0x02ab, B:149:0x02e0, B:151:0x02f3, B:153:0x0306, B:162:0x031d, B:165:0x0330, B:167:0x033a, B:169:0x034e, B:170:0x035b, B:171:0x0362, B:172:0x0363, B:173:0x036a, B:174:0x036b, B:177:0x037b, B:178:0x0396, B:180:0x039a, B:144:0x02bf, B:146:0x02c5), top: B:237:0x0285, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0363 A[Catch: all -> 0x03cc, RuntimeException -> 0x03ce, TryCatch #5 {RuntimeException -> 0x03ce, blocks: (B:140:0x0285, B:142:0x02ab, B:149:0x02e0, B:151:0x02f3, B:153:0x0306, B:162:0x031d, B:165:0x0330, B:167:0x033a, B:169:0x034e, B:170:0x035b, B:171:0x0362, B:172:0x0363, B:173:0x036a, B:174:0x036b, B:177:0x037b, B:178:0x0396, B:180:0x039a, B:144:0x02bf, B:146:0x02c5), top: B:237:0x0285, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x039a A[Catch: all -> 0x03cc, RuntimeException -> 0x03ce, TRY_LEAVE, TryCatch #5 {RuntimeException -> 0x03ce, blocks: (B:140:0x0285, B:142:0x02ab, B:149:0x02e0, B:151:0x02f3, B:153:0x0306, B:162:0x031d, B:165:0x0330, B:167:0x033a, B:169:0x034e, B:170:0x035b, B:171:0x0362, B:172:0x0363, B:173:0x036a, B:174:0x036b, B:177:0x037b, B:178:0x0396, B:180:0x039a, B:144:0x02bf, B:146:0x02c5), top: B:237:0x0285, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03db A[Catch: all -> 0x04b2, UnsupportedOperationException -> 0x04b4, IOException -> 0x04b6, TryCatch #3 {IOException -> 0x04b6, blocks: (B:3:0x0009, B:5:0x0010, B:6:0x001c, B:7:0x0031, B:9:0x0047, B:11:0x004f, B:12:0x005b, B:14:0x005e, B:16:0x0064, B:27:0x0089, B:41:0x00b4, B:54:0x00d3, B:56:0x00d8, B:59:0x00e0, B:61:0x00e5, B:64:0x00ee, B:66:0x00f3, B:68:0x00f8, B:71:0x0102, B:73:0x0107, B:48:0x00c6, B:49:0x00c9, B:52:0x00ce, B:34:0x0098, B:35:0x009b, B:38:0x00a0, B:79:0x011d, B:86:0x012e, B:91:0x0142, B:93:0x0153, B:95:0x017e, B:99:0x018f, B:102:0x01aa, B:103:0x01b8, B:105:0x01c4, B:107:0x01ce, B:110:0x01d2, B:112:0x01d9, B:114:0x01df, B:116:0x01e7, B:117:0x01eb, B:118:0x0203, B:96:0x0184, B:98:0x018a, B:182:0x03c1, B:121:0x021a, B:122:0x021f, B:124:0x0223, B:125:0x0233, B:127:0x0244, B:128:0x0251, B:131:0x0267, B:134:0x0273, B:137:0x0278, B:138:0x027f, B:139:0x0280, B:190:0x03da, B:191:0x03db, B:193:0x03e6, B:195:0x03ee, B:198:0x03f7, B:199:0x03fc, B:201:0x0400, B:202:0x0410, B:204:0x0460, B:207:0x046c, B:209:0x047a, B:211:0x049e, B:212:0x04aa, B:75:0x010c, B:77:0x0114), top: B:236:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03e6 A[Catch: all -> 0x04b2, UnsupportedOperationException -> 0x04b4, IOException -> 0x04b6, TryCatch #3 {IOException -> 0x04b6, blocks: (B:3:0x0009, B:5:0x0010, B:6:0x001c, B:7:0x0031, B:9:0x0047, B:11:0x004f, B:12:0x005b, B:14:0x005e, B:16:0x0064, B:27:0x0089, B:41:0x00b4, B:54:0x00d3, B:56:0x00d8, B:59:0x00e0, B:61:0x00e5, B:64:0x00ee, B:66:0x00f3, B:68:0x00f8, B:71:0x0102, B:73:0x0107, B:48:0x00c6, B:49:0x00c9, B:52:0x00ce, B:34:0x0098, B:35:0x009b, B:38:0x00a0, B:79:0x011d, B:86:0x012e, B:91:0x0142, B:93:0x0153, B:95:0x017e, B:99:0x018f, B:102:0x01aa, B:103:0x01b8, B:105:0x01c4, B:107:0x01ce, B:110:0x01d2, B:112:0x01d9, B:114:0x01df, B:116:0x01e7, B:117:0x01eb, B:118:0x0203, B:96:0x0184, B:98:0x018a, B:182:0x03c1, B:121:0x021a, B:122:0x021f, B:124:0x0223, B:125:0x0233, B:127:0x0244, B:128:0x0251, B:131:0x0267, B:134:0x0273, B:137:0x0278, B:138:0x027f, B:139:0x0280, B:190:0x03da, B:191:0x03db, B:193:0x03e6, B:195:0x03ee, B:198:0x03f7, B:199:0x03fc, B:201:0x0400, B:202:0x0410, B:204:0x0460, B:207:0x046c, B:209:0x047a, B:211:0x049e, B:212:0x04aa, B:75:0x010c, B:77:0x0114), top: B:236:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04bb A[Catch: all -> 0x04b2, TRY_LEAVE, TryCatch #10 {all -> 0x04b2, blocks: (B:3:0x0009, B:5:0x0010, B:6:0x001c, B:7:0x0031, B:9:0x0047, B:11:0x004f, B:12:0x005b, B:14:0x005e, B:16:0x0064, B:27:0x0089, B:41:0x00b4, B:54:0x00d3, B:56:0x00d8, B:59:0x00e0, B:61:0x00e5, B:64:0x00ee, B:66:0x00f3, B:68:0x00f8, B:71:0x0102, B:73:0x0107, B:48:0x00c6, B:49:0x00c9, B:52:0x00ce, B:34:0x0098, B:35:0x009b, B:38:0x00a0, B:79:0x011d, B:86:0x012e, B:91:0x0142, B:93:0x0153, B:95:0x017e, B:99:0x018f, B:102:0x01aa, B:103:0x01b8, B:105:0x01c4, B:107:0x01ce, B:110:0x01d2, B:112:0x01d9, B:114:0x01df, B:116:0x01e7, B:117:0x01eb, B:118:0x0203, B:96:0x0184, B:98:0x018a, B:182:0x03c1, B:121:0x021a, B:122:0x021f, B:124:0x0223, B:125:0x0233, B:127:0x0244, B:128:0x0251, B:131:0x0267, B:134:0x0273, B:137:0x0278, B:138:0x027f, B:139:0x0280, B:181:0x03be, B:189:0x03d7, B:190:0x03da, B:191:0x03db, B:193:0x03e6, B:195:0x03ee, B:198:0x03f7, B:199:0x03fc, B:201:0x0400, B:202:0x0410, B:204:0x0460, B:207:0x046c, B:209:0x047a, B:211:0x049e, B:212:0x04aa, B:75:0x010c, B:77:0x0114, B:219:0x04b7, B:221:0x04bb), top: B:236:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04c7 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x010a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:262:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d8 A[Catch: all -> 0x04b2, UnsupportedOperationException -> 0x04b4, IOException -> 0x04b6, TryCatch #3 {IOException -> 0x04b6, blocks: (B:3:0x0009, B:5:0x0010, B:6:0x001c, B:7:0x0031, B:9:0x0047, B:11:0x004f, B:12:0x005b, B:14:0x005e, B:16:0x0064, B:27:0x0089, B:41:0x00b4, B:54:0x00d3, B:56:0x00d8, B:59:0x00e0, B:61:0x00e5, B:64:0x00ee, B:66:0x00f3, B:68:0x00f8, B:71:0x0102, B:73:0x0107, B:48:0x00c6, B:49:0x00c9, B:52:0x00ce, B:34:0x0098, B:35:0x009b, B:38:0x00a0, B:79:0x011d, B:86:0x012e, B:91:0x0142, B:93:0x0153, B:95:0x017e, B:99:0x018f, B:102:0x01aa, B:103:0x01b8, B:105:0x01c4, B:107:0x01ce, B:110:0x01d2, B:112:0x01d9, B:114:0x01df, B:116:0x01e7, B:117:0x01eb, B:118:0x0203, B:96:0x0184, B:98:0x018a, B:182:0x03c1, B:121:0x021a, B:122:0x021f, B:124:0x0223, B:125:0x0233, B:127:0x0244, B:128:0x0251, B:131:0x0267, B:134:0x0273, B:137:0x0278, B:138:0x027f, B:139:0x0280, B:190:0x03da, B:191:0x03db, B:193:0x03e6, B:195:0x03ee, B:198:0x03f7, B:199:0x03fc, B:201:0x0400, B:202:0x0410, B:204:0x0460, B:207:0x046c, B:209:0x047a, B:211:0x049e, B:212:0x04aa, B:75:0x010c, B:77:0x0114), top: B:236:0x0009 }] */
    /* JADX WARN: Type inference failed for: r20v0, types: [asr] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v10, types: [android.media.MediaMetadataRetriever] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [android.media.MediaMetadataRetriever] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void l(java.io.InputStream r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asr.l(java.io.InputStream):void");
    }

    private final void m(asm asmVar) throws IOException {
        ByteOrder byteOrderD = d(asmVar);
        this.k = byteOrderD;
        asmVar.c = byteOrderD;
        int unsignedShort = asmVar.readUnsignedShort();
        int i2 = this.R;
        if (i2 != 7 && i2 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: ".concat(String.valueOf(Integer.toHexString(unsignedShort))));
        }
        int i3 = asmVar.readInt();
        if (i3 < 8) {
            throw new IOException(a.b(i3, "Invalid first Ifd offset: "));
        }
        int i4 = i3 - 8;
        if (i4 > 0) {
            asmVar.b(i4);
        }
    }

    private final void n() {
        for (int i2 = 0; i2 < 10; i2++) {
            StringBuilder sb = new StringBuilder("The size of tag group[");
            sb.append(i2);
            sb.append("]: ");
            HashMap[] mapArr = this.S;
            sb.append(mapArr[i2].size());
            Log.d("ExifInterface", sb.toString());
            for (Map.Entry entry : mapArr[i2].entrySet()) {
                asn asnVar = (asn) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + asnVar.toString() + ", tagValue: '" + asnVar.g(this.k) + "'");
            }
        }
    }

    private final void o(byte[] bArr, int i2) throws IOException {
        asq asqVar = new asq(bArr);
        m(asqVar);
        p(asqVar, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void p(defpackage.asq r33, int r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 881
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asr.p(asq, int):void");
    }

    private final void q(int i2, String str, String str2) {
        HashMap[] mapArr = this.S;
        if (mapArr[i2].isEmpty() || mapArr[i2].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i2];
        map.put(str2, (asn) map.get(str));
        mapArr[i2].remove(str);
    }

    private final void r(asm asmVar) throws Throwable {
        asn asnVar;
        int iA;
        HashMap map = this.S[4];
        asn asnVar2 = (asn) map.get("Compression");
        if (asnVar2 == null) {
            j(asmVar, map);
            return;
        }
        int iA2 = asnVar2.a(this.k);
        if (iA2 != 1) {
            if (iA2 == 6) {
                j(asmVar, map);
                return;
            } else if (iA2 != 7) {
                return;
            }
        }
        asn asnVar3 = (asn) map.get("BitsPerSample");
        if (asnVar3 != null) {
            int[] iArr = (int[]) asnVar3.f(this.k);
            int[] iArr2 = a;
            if (Arrays.equals(iArr2, iArr) || (this.R == 3 && (asnVar = (asn) map.get("PhotometricInterpretation")) != null && ((iA = asnVar.a(this.k)) != 1 ? !(iA != 6 || !Arrays.equals(iArr, iArr2)) : Arrays.equals(iArr, b)))) {
                k(asmVar, map);
                return;
            }
        }
        if (l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    private final void s(int i2, int i3) throws Throwable {
        HashMap[] mapArr = this.S;
        if (mapArr[i2].isEmpty() || mapArr[i3].isEmpty()) {
            if (l) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        asn asnVar = (asn) mapArr[i2].get("ImageLength");
        asn asnVar2 = (asn) mapArr[i2].get("ImageWidth");
        asn asnVar3 = (asn) mapArr[i3].get("ImageLength");
        asn asnVar4 = (asn) mapArr[i3].get("ImageWidth");
        if (asnVar == null || asnVar2 == null) {
            if (l) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (asnVar3 == null || asnVar4 == null) {
            if (l) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iA = asnVar.a(this.k);
        int iA2 = asnVar2.a(this.k);
        int iA3 = asnVar3.a(this.k);
        int iA4 = asnVar4.a(this.k);
        if (iA >= iA3 || iA2 >= iA4) {
            return;
        }
        HashMap map = mapArr[i2];
        mapArr[i2] = mapArr[i3];
        mapArr[i3] = map;
    }

    private final void t(asq asqVar, int i2) throws Throwable {
        asn asnVarE;
        asn asnVarE2;
        HashMap[] mapArr = this.S;
        asn asnVar = (asn) mapArr[i2].get("DefaultCropSize");
        asn asnVar2 = (asn) mapArr[i2].get("SensorTopBorder");
        asn asnVar3 = (asn) mapArr[i2].get("SensorLeftBorder");
        asn asnVar4 = (asn) mapArr[i2].get("SensorBottomBorder");
        asn asnVar5 = (asn) mapArr[i2].get("SensorRightBorder");
        if (asnVar != null) {
            if (asnVar.a == 5) {
                asp[] aspVarArr = (asp[]) asnVar.f(this.k);
                if (aspVarArr == null || aspVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=".concat(String.valueOf(Arrays.toString(aspVarArr))));
                    return;
                } else {
                    asnVarE = asn.d(aspVarArr[0], this.k);
                    asnVarE2 = asn.d(aspVarArr[1], this.k);
                }
            } else {
                int[] iArr = (int[]) asnVar.f(this.k);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=".concat(String.valueOf(Arrays.toString(iArr))));
                    return;
                } else {
                    asnVarE = asn.e(iArr[0], this.k);
                    asnVarE2 = asn.e(iArr[1], this.k);
                }
            }
            mapArr[i2].put("ImageWidth", asnVarE);
            mapArr[i2].put("ImageLength", asnVarE2);
            return;
        }
        if (asnVar2 != null && asnVar3 != null && asnVar4 != null && asnVar5 != null) {
            int iA = asnVar2.a(this.k);
            int iA2 = asnVar4.a(this.k);
            int iA3 = asnVar5.a(this.k);
            int iA4 = asnVar3.a(this.k);
            if (iA2 <= iA || iA3 <= iA4) {
                return;
            }
            asn asnVarE3 = asn.e(iA2 - iA, this.k);
            asn asnVarE4 = asn.e(iA3 - iA4, this.k);
            mapArr[i2].put("ImageLength", asnVarE3);
            mapArr[i2].put("ImageWidth", asnVarE4);
            return;
        }
        asn asnVar6 = (asn) mapArr[i2].get("ImageLength");
        asn asnVar7 = (asn) mapArr[i2].get("ImageWidth");
        if (asnVar6 == null || asnVar7 == null) {
            asn asnVar8 = (asn) mapArr[i2].get("JPEGInterchangeFormat");
            asn asnVar9 = (asn) mapArr[i2].get("JPEGInterchangeFormatLength");
            if (asnVar8 == null || asnVar9 == null) {
                return;
            }
            int iA5 = asnVar8.a(this.k);
            int iA6 = asnVar8.a(this.k);
            asqVar.c(iA5);
            byte[] bArr = new byte[iA6];
            asqVar.readFully(bArr);
            f(new asm(bArr), iA5, i2);
        }
    }

    private final void u() throws Throwable {
        s(0, 5);
        s(0, 4);
        s(5, 4);
        HashMap[] mapArr = this.S;
        asn asnVar = (asn) mapArr[1].get("PixelXDimension");
        asn asnVar2 = (asn) mapArr[1].get("PixelYDimension");
        if (asnVar != null && asnVar2 != null) {
            mapArr[0].put("ImageWidth", asnVar);
            mapArr[0].put("ImageLength", asnVar2);
        }
        if (mapArr[4].isEmpty() && v(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!v(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        q(0, "ThumbnailOrientation", "Orientation");
        q(0, "ThumbnailImageLength", "ImageLength");
        q(0, "ThumbnailImageWidth", "ImageWidth");
        q(5, "ThumbnailOrientation", "Orientation");
        q(5, "ThumbnailImageLength", "ImageLength");
        q(5, "ThumbnailImageWidth", "ImageWidth");
        q(4, "Orientation", "ThumbnailOrientation");
        q(4, "ImageLength", "ThumbnailImageLength");
        q(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private final boolean v(HashMap map) {
        asn asnVar = (asn) map.get("ImageLength");
        asn asnVar2 = (asn) map.get("ImageWidth");
        if (asnVar == null || asnVar2 == null) {
            return false;
        }
        return asnVar.a(this.k) <= 512 && asnVar2.a(this.k) <= 512;
    }

    public final asn a(String str) {
        asn asnVar;
        int i2;
        asn asnVar2;
        if ("ISOSpeedRatings".equals(str)) {
            if (l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        int i3 = 0;
        if ("Xmp".equals(str) && (i2 = this.R) != 4 && ((i2 == 9 || i2 == 15 || i2 == 12 || i2 == 13) && (asnVar2 = this.Z) != null)) {
            return asnVar2;
        }
        while (true) {
            int length = h.length;
            if (i3 >= 10) {
                if (!"Xmp".equals(str) || (asnVar = this.Z) == null) {
                    return null;
                }
                return asnVar;
            }
            asn asnVar3 = (asn) this.S[i3].get(str);
            if (asnVar3 != null) {
                return asnVar3;
            }
            i3++;
        }
    }

    public final String b(String str) throws Throwable {
        double d2;
        asn asnVarA = a(str);
        if (asnVarA == null) {
            return null;
        }
        if (str.equals("GPSTimeStamp")) {
            int i2 = asnVarA.a;
            if (i2 != 5 && i2 != 10) {
                Log.w("ExifInterface", a.b(i2, "GPS Timestamp format is not rational. format="));
                return null;
            }
            asp[] aspVarArr = (asp[]) asnVarA.f(this.k);
            if (aspVarArr == null || aspVarArr.length != 3) {
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=".concat(String.valueOf(Arrays.toString(aspVarArr))));
                return null;
            }
            asp aspVar = aspVarArr[0];
            Integer numValueOf = Integer.valueOf((int) (aspVar.a / aspVar.b));
            asp aspVar2 = aspVarArr[1];
            Integer numValueOf2 = Integer.valueOf((int) (aspVar2.a / aspVar2.b));
            asp aspVar3 = aspVarArr[2];
            return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (aspVar3.a / aspVar3.b)));
        }
        if (!M.contains(str)) {
            return asnVarA.g(this.k);
        }
        try {
            Object objF = asnVarA.f(this.k);
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
                if (!(objF instanceof asp[])) {
                    throw new NumberFormatException("Couldn't find a double value");
                }
                asp[] aspVarArr2 = (asp[]) objF;
                if (aspVarArr2.length != 1) {
                    throw new NumberFormatException("There are more than one component");
                }
                asp aspVar4 = aspVarArr2[0];
                d2 = aspVar4.a / aspVar4.b;
            }
            return Double.toString(d2);
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
