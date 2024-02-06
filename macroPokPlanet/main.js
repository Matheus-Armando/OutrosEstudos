import puppeteer from 'puppeteer-core';
import { getEdgePath } from 'edge-paths';

async function run() {
    const browser = await puppeteer.launch({
        executablePath: getEdgePath(),
        headless: false // Executa o navegador em modo não headless
    });
    const page = await browser.newPage();
    await page.goto('https://pokemon-planet.com/forums/game/');
    // await page.waitForSelector('input[id=search]');
    // await page.type('input[id=search]', 'Black Sabbath');
    // await page.keyboard.press('Enter');
    // await page.waitForNavigation();
}

run();