// Type definitions for react-native-honeywell-scanner 1.0
// Project: https://github.com/Volst/react-native-honeywell-scanner
// Definitions by: Adam Walker <https://github.com/crashdoom>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 3.4

declare namespace HoneywellScanner {
    const isCompatible: boolean;
    function onBarcodeReadSuccess(handler: (event: string | null) => void): void;
    function onBarcodeReadFail(handler: (event: string | null) => void): void;
    function offBarcodeReadSuccess(): void;
    function offBarcodeReadFail(): void;
    function startReader(): Promise<boolean>;
    function stopReader(): Promise<void>;
}

export default HoneywellScanner;
